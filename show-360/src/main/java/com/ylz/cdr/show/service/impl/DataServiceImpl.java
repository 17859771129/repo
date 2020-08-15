package com.ylz.cdr.show.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.bean.*;
import com.ylz.cdr.dao.*;
import com.ylz.cdr.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl {

    @Autowired
    private Hdsd0002ServiceImpl hdsd0002Service;
    @Autowired
    private Hdsd000302ServiceImpl hdsd000302Service;
    @Autowired
    private Hdsd000301ServiceImpl hdsd000301Service;
    @Autowired
    private Hdsd000401ServiceImpl hdsd000401Service;
    @Autowired
    private Hdsd000402ServiceImpl hdsd000402Service;
    @Autowired
    private Hdsd000502ServiceImpl hdsd000502Service;
    @Autowired
    private Hdsd000501ServiceImpl hdsd000501Service;
    @Autowired
    private Hdsd000603ServiceImpl hdsd000603Service;
    @Autowired
    private Hdsd000606ServiceImpl hdsd000606Service;
    @Autowired
    private Hdsd000605ServiceImpl hdsd000605Service;
    @Autowired
    private Hdsd000604ServiceImpl hdsd000604Service;
    @Autowired
    private Hdsd000602ServiceImpl hdsd000602Service;
    @Autowired
    private Hdsd000601ServiceImpl hdsd000601Service;
    @Autowired
    private Hdsd000702ServiceImpl hdsd000702Service;
    @Autowired
    private Hdsd000703ServiceImpl hdsd000703Service;
    @Autowired
    private Hdsd000701ServiceImpl hdsd000701Service;
    @Autowired
    private Hdsd000806ServiceImpl hdsd000806Service;
    @Autowired
    private Hdsd000801ServiceImpl hdsd000801Service;
    @Autowired
    private Hdsd000805ServiceImpl hdsd000805Service;
    @Autowired
    private Hdsd000803ServiceImpl hdsd000803Service;
    @Autowired
    private Hdsd000804ServiceImpl hdsd000804Service;
    @Autowired
    private Hdsd000802ServiceImpl hdsd000802Service;
    @Autowired
    private Hdsd000901ServiceImpl hdsd000901Service;
    @Autowired
    private Hdsd000903ServiceImpl hdsd000903Service;
    @Autowired
    private Hdsd000902ServiceImpl hdsd000902Service;
    @Autowired
    private Hdsd001002ServiceImpl hdsd001002Service;
    @Autowired
    private Hdsd001004ServiceImpl hdsd001004Service;
    @Autowired
    private Hdsd001005ServiceImpl hdsd001005Service;
    @Autowired
    private Hdsd001003ServiceImpl hdsd001003Service;
    @Autowired
    private Hdsd001006ServiceImpl hdsd001006Service;
    @Autowired
    private Hdsd001001ServiceImpl hdsd001001Service;
    @Autowired
    private Hdsd001101ServiceImpl hdsd001101Service;
    @Autowired
    private Hdsd001201ServiceImpl hdsd001201Service;
    @Autowired
    private Hdsd001302ServiceImpl hdsd001302Service;
    @Autowired
    private Hdsd001301ServiceImpl hdsd001301Service;
    @Autowired
    private Hdsd001303ServiceImpl hdsd001303Service;
    @Autowired
    private Hdsd001414ServiceImpl hdsd001414Service;
    @Autowired
    private Hdsd001408ServiceImpl hdsd001408Service;
    @Autowired
    private Hdsd001415ServiceImpl hdsd001415Service;
    @Autowired
    private Hdsd001410ServiceImpl hdsd001410Service;
    @Autowired
    private Hdsd001409ServiceImpl hdsd001409Service;
    @Autowired
    private Hdsd001405ServiceImpl hdsd001405Service;
    @Autowired
    private Hdsd001401ServiceImpl hdsd001401Service;
    @Autowired
    private Hdsd001403ServiceImpl hdsd001403Service;
    @Autowired
    private Hdsd001402ServiceImpl hdsd001402Service;
    @Autowired
    private Hdsd001404ServiceImpl hdsd001404Service;
    @Autowired
    private Hdsd001412ServiceImpl hdsd001412Service;
    @Autowired
    private Hdsd001406ServiceImpl hdsd001406Service;
    @Autowired
    private Hdsd001411ServiceImpl hdsd001411Service;
    @Autowired
    private Hdsd001416ServiceImpl hdsd001416Service;
    @Autowired
    private Hdsd001407ServiceImpl hdsd001407Service;
    @Autowired
    private Hdsd001501ServiceImpl hdsd001501Service;
    @Autowired
    private Hdsd001601ServiceImpl hdsd001601Service;


    @Autowired
    private TdyListTestMapper tdyListTestMapper;
    @Autowired
    private TdyListDrugMapper tdyListDrugMapper;
    @Autowired
    private TdyListOrderMapper tdyListOrderMapper;
    @Autowired
    private TdyListDiagMapper tdyListDiagMapper;
    @Autowired
    private TdyListOperMapper tdyListOperMapper;
    @Autowired
    private TdyListNurseMapper tdyListNurseMapper;

    @Autowired
    private TdyListAnesMapper tdyListAnesMapper;
    @Autowired
    private TdyListDietGuideMapper tdyListDietGuideMapper;
    @Autowired
    private TdyListNurseTracheaMapper tdyListNurseTracheaMapper;
    @Autowired
    private TdyListNurseSafetyMapper tdyListNurseSafetyMapper;
    @Autowired
    private TdyListLexamMapper tdyListLexamMapper;

    public ServiceImpl getBaseService(String xdsType) throws Exception {
        switch (xdsType) {
            case "C0001":
                return hdsd0002Service;
            case "C0002":
                return hdsd000302Service;
            case "C0003":
                return hdsd000301Service;
            case "C0004":
                return hdsd000401Service;
            case "C0005":
                return hdsd000402Service;
            case "C0006":
                return hdsd000502Service;
            case "C0007":
                return hdsd000501Service;
            case "C0008":
                return hdsd000603Service;
            case "C0009":
                return hdsd000606Service;
            case "C0010":
                return hdsd000605Service;
            case "C0011":
                return hdsd000604Service;
            case "C0012":
                return hdsd000602Service;
            case "C0013":
                return hdsd000601Service;
            case "C0014":
                return hdsd000702Service;
            case "C0015":
                return hdsd000703Service;
            case "C0016":
                return hdsd000701Service;
            case "C0017":
                return hdsd000806Service;
            case "C0018":
                return hdsd000801Service;
            case "C0019":
                return hdsd000805Service;
            case "C0020":
                return hdsd000803Service;
            case "C0021":
                return hdsd000804Service;
            case "C0022":
                return hdsd000802Service;
            case "C0023":
                return hdsd000901Service;
            case "C0024":
                return hdsd000903Service;
            case "C0025":
                return hdsd000902Service;
            case "C0026":
                return hdsd001002Service;
            case "C0027":
                return hdsd001004Service;
            case "C0028":
                return hdsd001005Service;
            case "C0029":
                return hdsd001003Service;
            case "C0030":
                return hdsd001006Service;
            case "C0031":
                return hdsd001001Service;
            case "C0032":
                return hdsd001101Service;
            case "C0033":
                return hdsd001201Service;
            case "C0034":
                return hdsd001302Service;
            case "C0035":
                return hdsd001301Service;
            case "C0036":
                return hdsd001303Service;
            case "C0037":
                return hdsd001414Service;
            case "C0038":
                return hdsd001408Service;
            case "C0039":
                return hdsd001415Service;
            case "C0040":
                return hdsd001410Service;
            case "C0041":
                return hdsd001409Service;
            case "C0042":
                return hdsd001405Service;
            case "C0043":
                return hdsd001401Service;
            case "C0044":
                return hdsd001403Service;
            case "C0045":
                return hdsd001402Service;
            case "C0046":
                return hdsd001404Service;
            case "C0047":
                return hdsd001412Service;
            case "C0048":
                return hdsd001406Service;
            case "C0049":
                return hdsd001411Service;
            case "C0050":
                return hdsd001416Service;
            case "C0051":
                return hdsd001407Service;
            case "C0052":
                return hdsd001501Service;
            case "C0053":
                return hdsd001601Service;
            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }

    public Class getBean(String xdsType) throws Exception {
        switch (xdsType) {
            case "C0001":
                return Hdsd0002.class;
            case "C0002":
                return Hdsd000302.class;
            case "C0003":
                return Hdsd000301.class;
            case "C0004":
                return Hdsd000401.class;
            case "C0005":
                return Hdsd000402.class;
            case "C0006":
                return Hdsd000502.class;
            case "C0007":
                return Hdsd000501.class;
            case "C0008":
                return Hdsd000603.class;
            case "C0009":
                return Hdsd000606.class;
            case "C0010":
                return Hdsd000605.class;
            case "C0011":
                return Hdsd000604.class;
            case "C0012":
                return Hdsd000602.class;
            case "C0013":
                return Hdsd000601.class;
            case "C0014":
                return Hdsd000702.class;
            case "C0015":
                return Hdsd000703.class;
            case "C0016":
                return Hdsd000701.class;
            case "C0017":
                return Hdsd000806.class;
            case "C0018":
                return Hdsd000801.class;
            case "C0019":
                return Hdsd000805.class;
            case "C0020":
                return Hdsd000803.class;
            case "C0021":
                return Hdsd000804.class;
            case "C0022":
                return Hdsd000802.class;
            case "C0023":
                return Hdsd000901.class;
            case "C0024":
                return Hdsd000903.class;
            case "C0025":
                return Hdsd000902.class;
            case "C0026":
                return Hdsd001002.class;
            case "C0027":
                return Hdsd001004.class;
            case "C0028":
                return Hdsd001005.class;
            case "C0029":
                return Hdsd001003.class;
            case "C0030":
                return Hdsd001006.class;
            case "C0031":
                return Hdsd001001.class;
            case "C0032":
                return Hdsd001101.class;
            case "C0033":
                return Hdsd001201.class;
            case "C0034":
                return Hdsd001302.class;
            case "C0035":
                return Hdsd001301.class;
            case "C0036":
                return Hdsd001303.class;
            case "C0037":
                return Hdsd001414.class;
            case "C0038":
                return Hdsd001408.class;
            case "C0039":
                return Hdsd001415.class;
            case "C0040":
                return Hdsd001410.class;
            case "C0041":
                return Hdsd001409.class;
            case "C0042":
                return Hdsd001405.class;
            case "C0043":
                return Hdsd001401.class;
            case "C0044":
                return Hdsd001403.class;
            case "C0045":
                return Hdsd001402.class;
            case "C0046":
                return Hdsd001404.class;
            case "C0047":
                return Hdsd001412.class;
            case "C0048":
                return Hdsd001406.class;
            case "C0049":
                return Hdsd001411.class;
            case "C0050":
                return Hdsd001416.class;
            case "C0051":
                return Hdsd001407.class;
            case "C0052":
                return Hdsd001501.class;
            case "C0053":
                return Hdsd001601.class;
            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }

    public Class getSubBean(String xdsType) throws Exception {
        switch (xdsType) {
            case "tdyListCddiag":
                return TdyListDiag.class;
            case "tdyListCsdiag":
                return TdyListDiag.class;
            case "tdyListCdiag":
                return TdyListDiag.class;
            case "tdyListCdcdiag":
                return TdyListDiag.class;
            case "tdyListCdwdiag":
                return TdyListDiag.class;
            case "tdyListIcddiag":
                return TdyListDiag.class;
            case "tdyListIcsdiag":
                return TdyListDiag.class;
            case "tdyListIcdiag":
                return TdyListDiag.class;
            case "tdyListIwdiag":
                return TdyListDiag.class;
            case "tdyListIdiag":
                return TdyListDiag.class;
            case "tdyListWodiag":
                return TdyListDiag.class;
            case "tdyListDcmdiag":
                return TdyListDiag.class;
            case "tdyListDcpdiag":
                return TdyListDiag.class;
            case "tdyListDwmdiag":
                return TdyListDiag.class;
            case "tdyListDwodiag":
                return TdyListDiag.class;
            case "tdyListDcddiag":
                return TdyListDiag.class;
            case "tdyListDcsdiag":
                return TdyListDiag.class;
            case "tdyListDcdiag":
                return TdyListDiag.class;
            case "tdyListDmdiag":
                return TdyListDiag.class;
            case "tdyListDodiag":
                return TdyListDiag.class;
            case "tdyListDwdiag":
                return TdyListDiag.class;
            case "tdyListDdiag":
                return TdyListDiag.class;
            case "tdyListPdcddiag":
                return TdyListDiag.class;
            case "tdyListPdcsdiag":
                return TdyListDiag.class;
            case "tdyListPdcdiag":
                return TdyListDiag.class;
            case "tdyListPdwdiag":
                return TdyListDiag.class;
            case "tdyListOrder":
                return TdyListOrder.class;
            case "tdyListNurseSafety":
                return TdyListNurseSafety.class;
            case "tdyListLexam":
                return TdyListLexam.class;
            case "tdyListOper":
                return TdyListOper.class;
            case "tdyListNurse":
                return TdyListNurse.class;
            case "tdyListOnurse":
                return TdyListNurse.class;
            case "tdyListQoper":
                return TdyListOper.class;
            case "tdyListQanes":
                return TdyListAnes.class;
            case "tdyListObdiag":
                return TdyListDiag.class;
            case "tdyListOadiag":
                return TdyListDiag.class;
            case "tdyListTest":
                return TdyListTest.class;
            case "tdyListDecdiag":
                return TdyListDiag.class;
            case "tdyListDewdiag":
                return TdyListDiag.class;
            case "tdyListDediag":
                return TdyListDiag.class;
            case "tdyListNurseTrachea":
                return TdyListNurseTrachea.class;
            case "tdyListDrug":
                return TdyListDrug.class;
            case "tdyListDiag":
                return TdyListDiag.class;
            case "tdyListPdiag":
                return TdyListDiag.class;
            case "tdyListApcddiag":
                return TdyListDiag.class;
            case "tdyListApcsdiag":
                return TdyListDiag.class;
            case "tdyListApwdiag":
                return TdyListDiag.class;
            case "tdyListEdcdiag":
                return TdyListDiag.class;
            case "tdyListEdwdiag":
                return TdyListDiag.class;
            case "tdyListSdwdiag":
                return TdyListDiag.class;
            case "tdyListWdiag":
                return TdyListDiag.class;
            case "tdyListIdcddiag":
                return TdyListDiag.class;
            case "tdyListIdcsdiag":
                return TdyListDiag.class;
            case "tdyListIdwdiag":
                return TdyListDiag.class;
            case "tdyListCcsdiag":
                return TdyListDiag.class;
            case "tdyListCcdiag":
                return TdyListDiag.class;
            case "tdyListCwdiag":
                return TdyListDiag.class;
            case "tdyListCediag":
                return TdyListDiag.class;
            case "tdyListDietGuide":
                return TdyListDietGuide.class;
            case "tdyListAnes":
                return TdyListAnes.class;
            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }

    public BaseMapper getSubBaseDao(String xdsType) throws Exception {
        switch (xdsType) {
            case "tdyListCddiag":
                return tdyListDiagMapper;
            case "tdyListCsdiag":
                return tdyListDiagMapper;
            case "tdyListCdiag":
                return tdyListDiagMapper;
            case "tdyListCdcdiag":
                return tdyListDiagMapper;
            case "tdyListCdwdiag":
                return tdyListDiagMapper;
            case "tdyListIcddiag":
                return tdyListDiagMapper;
            case "tdyListIcsdiag":
                return tdyListDiagMapper;
            case "tdyListIcdiag":
                return tdyListDiagMapper;
            case "tdyListIwdiag":
                return tdyListDiagMapper;
            case "tdyListIdiag":
                return tdyListDiagMapper;
            case "tdyListWodiag":
                return tdyListDiagMapper;
            case "tdyListDcmdiag":
                return tdyListDiagMapper;
            case "tdyListDcpdiag":
                return tdyListDiagMapper;
            case "tdyListDwmdiag":
                return tdyListDiagMapper;
            case "tdyListDwodiag":
                return tdyListDiagMapper;
            case "tdyListDcddiag":
                return tdyListDiagMapper;
            case "tdyListDcsdiag":
                return tdyListDiagMapper;
            case "tdyListDcdiag":
                return tdyListDiagMapper;
            case "tdyListDmdiag":
                return tdyListDiagMapper;
            case "tdyListDodiag":
                return tdyListDiagMapper;
            case "tdyListDwdiag":
                return tdyListDiagMapper;
            case "tdyListDdiag":
                return tdyListDiagMapper;
            case "tdyListPdcddiag":
                return tdyListDiagMapper;
            case "tdyListPdcsdiag":
                return tdyListDiagMapper;
            case "tdyListPdcdiag":
                return tdyListDiagMapper;
            case "tdyListPdwdiag":
                return tdyListDiagMapper;
            case "tdyListOrder":
                return tdyListOrderMapper;
            case "tdyListNurseSafety":
                return tdyListNurseSafetyMapper;
            case "tdyListLexam":
                return tdyListLexamMapper;
            case "tdyListOper":
                return tdyListOperMapper;
            case "tdyListNurse":
                return tdyListNurseMapper;
            case "tdyListOnurse":
                return tdyListNurseMapper;
            case "tdyListQoper":
                return tdyListOperMapper;
            case "tdyListQanes":
                return tdyListAnesMapper;
            case "tdyListObdiag":
                return tdyListDiagMapper;
            case "tdyListOadiag":
                return tdyListDiagMapper;
            case "tdyListTest":
                return tdyListTestMapper;
            case "tdyListDecdiag":
                return tdyListDiagMapper;
            case "tdyListDewdiag":
                return tdyListDiagMapper;
            case "tdyListDediag":
                return tdyListDiagMapper;
            case "tdyListNurseTrachea":
                return tdyListNurseTracheaMapper;
            case "tdyListDrug":
                return tdyListDrugMapper;
            case "tdyListDiag":
                return tdyListDiagMapper;
            case "tdyListPdiag":
                return tdyListDiagMapper;
            case "tdyListApcddiag":
                return tdyListDiagMapper;
            case "tdyListApcsdiag":
                return tdyListDiagMapper;
            case "tdyListApwdiag":
                return tdyListDiagMapper;
            case "tdyListEdcdiag":
                return tdyListDiagMapper;
            case "tdyListEdwdiag":
                return tdyListDiagMapper;
            case "tdyListSdwdiag":
                return tdyListDiagMapper;
            case "tdyListWdiag":
                return tdyListDiagMapper;
            case "tdyListIdcddiag":
                return tdyListDiagMapper;
            case "tdyListIdcsdiag":
                return tdyListDiagMapper;
            case "tdyListIdwdiag":
                return tdyListDiagMapper;
            case "tdyListCcsdiag":
                return tdyListDiagMapper;
            case "tdyListCcdiag":
                return tdyListDiagMapper;
            case "tdyListCwdiag":
                return tdyListDiagMapper;
            case "tdyListCediag":
                return tdyListDiagMapper;
            case "tdyListDietGuide":
                return tdyListDietGuideMapper;
            case "tdyListAnes":
                return tdyListAnesMapper;
            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }
}
