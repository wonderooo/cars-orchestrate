package com.kacpers.cars.feign.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

public record LotSearchResponse(
    Set<LotSearch> content
) {
    public record LotSearch(
        Long ln,
        List<String> siteCodes,
        DynamicLotDetails dynamicLotDetails,
        Boolean driveStatus,
        String vehicleTypeCode,
        String memberVehicleType,
        String odometerUOM,
        Boolean showClaimForm,
        Double lotPlugAcv,
        Boolean readyForReplayFlag,
        Boolean pwlot,
        Boolean lotYardSameAsKioskYard,
        Boolean carFaxReportAvailable,
        Long lotNumberStr,
        String mkn,
        String lmg,
        String lm,
        String mmod,
        String mtrim,
        Integer lcy,
        String fv,
        String efv,
        String evn,
        Double la,
        Double rc,
        String obc,
        Double orr,
        List<String>lfd,
        String ord,
        String egn,
        String cy,
        String ld,
        String yn,
        String cuc,
        String tz,
        Long ad,
        Long lad,
        String at,
        Integer aan,
        Double hb,
        Integer ss,
        String bndc,
        Double bnp,
        Boolean sbf,
        String ts,
        String stt,
        String td,
        String tgc,
        String tgd,
        String dd,
        String tims,
        List<String> lic,
        String gr,
        String dtc,
        String al,
        String adt,
        Integer ynumb,
        Integer phynumb,
        Boolean bf,
        Integer ymin,
        Double Longitude,
        Double latitude,
        String zip,
        Boolean offFlg,
        String locCountry,
        String locCity,
        String locState,
        String htsmn,
        String tmtp,
        Double myb,
        String lmc,
        String lcc,
        String sdd,
        String bstl,
        String lcd,
        String clr,
        String ft,
        String hk,
        String sn,
        String drv,
        String ess,
        String lsts,
        Boolean showSeller,
        Boolean sstpflg,
        Boolean hcr,
        String syn,
        Boolean ifs,
        Boolean pbf,
        Double crg,
        String brand,
        String gou,
        Boolean blucar,
        Integer lstg,
        String ldu,
        Boolean pcf,
        Boolean btcf,
        Boolean tpfs,
        Boolean trf,
        String csc,
        Boolean mlf,
        Boolean fcd,
        Integer slgc,
        Boolean cfx,
        Boolean hcfx,
        Boolean hideLaneItem,
        Boolean hideGridRow,
        Boolean isPWlot,
        Double lspa
) {
    public record DynamicLotDetails(
        String errorCode,
        Integer buyerNumber,
        String source,
        Double buyTodayBid,
        Double currentBid,
        Double totalAmountDue,
        Boolean sealedBid,
        Boolean firstBid,
        Boolean hasBid,
        Boolean sellerReserveMet,
        Boolean lotSold,
        String bidStatus,
        String saleStatus,
        String counterBidStatus,
        Boolean startingBidFlag,
        Boolean buyerHighBidder,
        Boolean anonymous,
        Boolean nonSyncedBuyer
    ) {}
    }
}
