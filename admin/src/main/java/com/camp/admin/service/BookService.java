package com.camp.admin.service;

import com.camp.admin.DTO.BookDTO;
import com.camp.admin.DTO.ReservationDTO;
import com.camp.admin.DTO.SiteDTO;
import com.camp.admin.DTO.ZoneDTO;
import com.camp.admin.frame.MyService;
import com.camp.admin.mapper.BookMapper;
import com.camp.admin.utility.MakeMainGraph;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements MyService<Integer, BookDTO> {

    @Autowired
    BookMapper mapper;
    @Autowired
    ReservationService reservationService;
    @Autowired
    SiteService siteService;

    @Autowired
    ZoneService zoneService;

    @Override
    public void insert(BookDTO v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void delete(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void update(BookDTO v) throws Exception {
        mapper.update(v);
    }

    @Override
    public BookDTO select(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<BookDTO> selectAll() throws Exception {
        return mapper.selectAll();
    }

    public BookDTO selectMerchant(String merchant_uid) {
        return mapper.selectMerchant(merchant_uid);
    }

    public void insertBookAndReservation(BookDTO v) throws Exception {
        this.insert(v);

        BookDTO book = this.selectMerchant(v.getMerchant_uid());
        reservationService.insertReservationByBook(book);
    }


    public BookDTO selectViewForm(String book_checkin, String book_checkout, int book_sitecode) {

        BookDTO book = new BookDTO();
        try {
            SiteDTO site = siteService.select(book_sitecode);
            book.setSite_name(site.getSite_name());
            book.setBook_price(site.getSite_price());
        } catch (Exception e) {
            e.printStackTrace();
        }
        DateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
        Calendar cal = Calendar.getInstance();
        Random random = new Random();
        book.setMerchant_uid(dateFormat.format(cal.getTime()) + random.nextInt(100000));
        book.setBook_checkin(book_checkin);
        book.setBook_checkout(book_checkout);
        book.setSite_code(book_sitecode);

        return book;
    }

    public List<Map<String, Object>> selectAllState(int book_state) {
        return mapper.selectAllState(book_state);
    }

    public int updateBookState(String merchant_uid, int state) {
        return mapper.updateBookState(merchant_uid, state);
    }


    public List<BookDTO> selectUserBook(int company_code, String user_id) {
        return mapper.selectUserBook(company_code, user_id);
    }


    public List<Map<String, Object>> selectAllmain(int companyCode) {
        return mapper.selectAllmain(companyCode);
    }

    public List<BookDTO> selectByCompanyCodeAndYearMonth(int company_code, String stringYearMonth) {
        return mapper.selectByCompanyCodeAndYearMonth(company_code, stringYearMonth + "%");
    }

    public List<BookDTO> selectByCompanyCodeAndWriteDate(int company_code,
        String stringYearAndMonth) {

        return mapper.selectByCompanyCodeAndWriteDate(company_code, "%" + stringYearAndMonth + "%");

    }

    public MakeMainGraph getMonthGraph(int company_code, String stringYearAndMonth) {
        List<BookDTO> bookList = selectByCompanyCodeAndYearMonth(company_code, stringYearAndMonth);
        List<BookDTO> bookList2 = selectByCompanyCodeAndWriteDate(company_code, stringYearAndMonth);
        List<ReservationDTO> reservationList = reservationService.selectByCompanyCodeAndYearMonth(
            company_code, stringYearAndMonth);
        return new MakeMainGraph(bookList, reservationList, stringYearAndMonth, bookList2);
    }

    public Map<String, String> SiteCodeAndZoneNameMap(int company_code) throws Exception {
        Map<String, String> ScZn = new TreeMap<>();
        List<SiteDTO> siteList = siteService.selectSet(company_code);
        List<ZoneDTO> zoneList = zoneService.selectZone(company_code);
        for (SiteDTO site : siteList) {
            String zoneName = "";
            for (ZoneDTO zone : zoneList) {
                if (zone.getZone_code() == site.getZone_code()) {
                    zoneName = zone.getZone_name();
                }
            }
            ScZn.put("" + site.getSite_code(), zoneName);
        }
        return ScZn;
    }
}
