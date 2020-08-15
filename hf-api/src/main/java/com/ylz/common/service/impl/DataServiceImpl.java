package com.ylz.common.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.hf.bean.*;
import com.ylz.cda.bean.*;
import com.ylz.cda.dao.*;
import com.ylz.cda.service.impl.*;
import com.ylz.hf.dao.*;
import com.ylz.hf.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl {

    @Autowired
    private AllergyInfoMapper allergyInfoMapper;
    @Autowired
    private BloodHistoryInfoMapper bloodHistoryInfoMapper;
    @Autowired
    private ConsultationInfoMapper consultationInfoMapper;
    @Autowired
    private ContactHarmInfoMapper contactHarmInfoMapper;
    @Autowired
    private ContactInfoMapper contactInfoMapper;
    @Autowired
    private DisabilityHistoryInfoMapper disabilityHistoryInfoMapper;
    @Autowired
    private DiseaseHistoryInfoMapper diseaseHistoryInfoMapper;
    @Autowired
    private FamilyHistoryInfoMapper familyHistoryInfoMapper;
    @Autowired
    private GuardianInfoMapper guardianInfoMapper;
    @Autowired
    private HomeBedInfoMapper homeBedInfoMapper;
    @Autowired
    private Hdsd000401Mapper hdsd000401Mapper;
    @Autowired
    private Hdsd000501Mapper hdsd000501Mapper;
    @Autowired
    private Hdsd000502Mapper hdsd000502Mapper;
    @Autowired
    private Hdsd000606Mapper hdsd000606Mapper;
    @Autowired
    private Hdsd001501Mapper hdsd001501Mapper;
    @Autowired
    private Hdsd001601Mapper hdsd001601Mapper;
    @Autowired
    private Hdsd000803Mapper hdsd000803Mapper;
    @Autowired
    private Hdsd000806Mapper hdsd000806Mapper;
    @Autowired
    private Hdsd001101Mapper hdsd001101Mapper;
    @Autowired
    private Hdsd001302Mapper hdsd001302Mapper;
    @Autowired
    private Hdsd001408Mapper hdsd001408Mapper;
    @Autowired
    private Hdsd001414Mapper hdsd001414Mapper;
    @Autowired
    private Hsda0001Mapper hsda0001Mapper;
    @Autowired
    private Hsdb0101Mapper hsdb0101Mapper;
    @Autowired
    private Hsdb0102Mapper hsdb0102Mapper;
    @Autowired
    private Hsdb0103Mapper hsdb0103Mapper;
    @Autowired
    private Hsdb0201Mapper hsdb0201Mapper;
    @Autowired
    private Hsdb0202Mapper hsdb0202Mapper;
    @Autowired
    private Hsdb0203Mapper hsdb0203Mapper;
    @Autowired
    private Hsdb0204Mapper hsdb0204Mapper;
    @Autowired
    private Hsdb0301Mapper hsdb0301Mapper;
    @Autowired
    private Hsdb0302Mapper hsdb0302Mapper;
    @Autowired
    private Hsdb0303Mapper hsdb0303Mapper;
    @Autowired
    private Hsdb0401Mapper hsdb0401Mapper;
    @Autowired
    private Hsdb0402Mapper hsdb0402Mapper;
    @Autowired
    private Hsdb0403Mapper hsdb0403Mapper;
    @Autowired
    private Hsdb0404Mapper hsdb0404Mapper;
    @Autowired
    private Hsdc0001Mapper hsdc0001Mapper;
    @Autowired
    private Hsdc0002Mapper hsdc0002Mapper;
    @Autowired
    private Hsdc0003Mapper hsdc0003Mapper;
    @Autowired
    private Hsdc0004Mapper hsdc0004Mapper;
    @Autowired
    private Hsdc0005Mapper hsdc0005Mapper;
    @Autowired
    private InhospHistoryInfoMapper inhospHistoryInfoMapper;
    @Autowired
    private InhospInfoMapper inhospInfoMapper;
    @Autowired
    private InjuryHistoryInfoMapper injuryHistoryInfoMapper;
    @Autowired
    private InoculationInfoMapper inoculationInfoMapper;
    @Autowired
    private NeighborInfoMapper neighborInfoMapper;
    @Autowired
    private OperHistoryInfoMapper operHistoryInfoMapper;
    @Autowired
    private OperInfoMapper operInfoMapper;
    @Autowired
    private ProfessionExposeInfoMapper professionExposeInfoMapper;
    @Autowired
    private AdverseVaccineMapper adverseVaccineMapper;
    @Autowired
    private DeathInfoMapper deathInfoMapper;
    @Autowired
    private DiagAdverseInfoMapper diagAdverseMapper;
    @Autowired
    private DiagInfoMapper diagInfoMapper;
    @Autowired
    private DiseaseTypeInfoMapper diseaseTypeInfoMapper;
    @Autowired
    private DrugInfoMapper drugInfoMapper;
    @Autowired
    private InfectiousInfoMapper infectiousInfoMapper;
    @Autowired
    private LabItemInfoMapper labItemInfoMapper;
    @Autowired
    private LaboratoryInfoMapper laboratoryInfoMapper;
    @Autowired
    private PhysiqueClassifyInfoMapper physiqueClassifyInfoMapper;
    @Autowired
    private PhysiqueDecideInfoMapper physiqueDecideInfoMapper;
    @Autowired
    private SpiritInfoMapper spiritInfoMapper;
    @Autowired
    private SymptomInfoMapper symptomInfoMapper;
    @Autowired
    private HealthGuideMapper healthGuideMapper;
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

    public BaseMapper getBaseDao(String xdsType) throws Exception {
        switch (xdsType) {
            case "HSDA00.01":
                return hsda0001Mapper;
            case "HSDB01.01":
                return hsdb0101Mapper;
            case "HSDB01.02":
                return hsdb0102Mapper;
            case "HSDB01.03":
                return hsdb0103Mapper;
            case "HSDB02.01":
                return hsdb0201Mapper;
            case "HSDB02.02":
                return hsdb0202Mapper;
            case "HSDB02.03":
                return hsdb0203Mapper;
            case "HSDB02.04":
                return hsdb0204Mapper;
            case "HSDB03.01":
                return hsdb0301Mapper;
            case "HSDB03.02":
                return hsdb0302Mapper;
            case "HSDB03.03":
                return hsdb0303Mapper;
            case "HSDB04.01":
                return hsdb0401Mapper;
            case "HSDB04.02":
                return hsdb0402Mapper;
            case "HSDB04.03":
                return hsdb0403Mapper;
            case "HSDB04.04":
                return hsdb0404Mapper;
            case "HSDC00.01":
                return hsdc0001Mapper;
            case "HSDC00.02":
                return hsdc0002Mapper;
            case "HSDC00.03":
                return hsdc0003Mapper;
            case "HSDC00.04":
                return hsdc0004Mapper;
            case "HSDC00.05":
                return hsdc0005Mapper;
            case "C0004":
                return hdsd000401Mapper;
            case "C0006":
                return hdsd000502Mapper;
            case "C0007":
                return hdsd000501Mapper;
            case "C0009":
                return hdsd000606Mapper;
            case "C0052":
                return hdsd001501Mapper;
            case "C0053":
                return hdsd001601Mapper;
            case "C0017":
                return hdsd000806Mapper;
            case "C0020":
                return hdsd000803Mapper;
            case "C0032":
                return hdsd001101Mapper;
            case "C0034":
                return hdsd001302Mapper;
            case "C0037":
                return hdsd001414Mapper;
            case "C0038":
                return hdsd001408Mapper;

            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }

    public Class getBean(String xdsType) throws Exception {
        switch (xdsType) {
            case "HSDA00.01":
                return Hsda0001.class;
            case "HSDB01.01":
                return Hsdb0101.class;
            case "HSDB01.02":
                return Hsdb0102.class;
            case "HSDB01.03":
                return Hsdb0103.class;
            case "HSDB02.01":
                return Hsdb0201.class;
            case "HSDB02.02":
                return Hsdb0202.class;
            case "HSDB02.03":
                return Hsdb0203.class;
            case "HSDB02.04":
                return Hsdb0204.class;
            case "HSDB03.01":
                return Hsdb0301.class;
            case "HSDB03.02":
                return Hsdb0302.class;
            case "HSDB03.03":
                return Hsdb0303.class;
            case "HSDB04.01":
                return Hsdb0401.class;
            case "HSDB04.02":
                return Hsdb0402.class;
            case "HSDB04.03":
                return Hsdb0403.class;
            case "HSDB04.04":
                return Hsdb0404.class;
            case "HSDC00.01":
                return Hsdc0001.class;
            case "HSDC00.02":
                return Hsdc0002.class;
            case "HSDC00.03":
                return Hsdc0003.class;
            case "HSDC00.04":
                return Hsdc0004.class;
            case "HSDC00.05":
                return Hsdc0005.class;
            case "C0004":
                return Hdsd000401.class;
            case "C0006":
                return Hdsd000502.class;
            case "C0007":
                return Hdsd000501.class;
            case "C0009":
                return Hdsd000606.class;
            case "C0052":
                return Hdsd001501.class;
            case "C0053":
                return Hdsd001601.class;
            case "C0017":
                return Hdsd000806.class;
            case "C0020":
                return Hdsd000803.class;
            case "C0032":
                return Hdsd001101.class;
            case "C0034":
                return Hdsd001302.class;
            case "C0037":
                return Hdsd001414.class;
            case "C0038":
                return Hdsd001408.class;
            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }

    public Class getSubBean(String xdsType) throws Exception {
        switch (xdsType) {
            case "allergyInfo":
                return AllergyInfo.class;
            case "adverseVaccine":
                return AdverseVaccine.class;
            case "bloodHistoryInfo":
                return BloodHistoryInfo.class;
            case "consultationInfo":
                return ConsultationInfo.class;
            case "contactHarmInfo":
                return ContactHarmInfo.class;
            case "contactInfo":
                return ContactInfo.class;
            case "disabilityHistoryInfo":
                return DisabilityHistoryInfo.class;
            case "diseaseHistoryInfo":
                return DiseaseHistoryInfo.class;
            case "familyHistoryInfo":
                return FamilyHistoryInfo.class;
            case "guardianInfo":
                return GuardianInfo.class;
            case "homeBedInfo":
                return HomeBedInfo.class;
            case "inhospHistoryInfo":
                return InhospHistoryInfo.class;
            case "inhospInfo":
                return InhospInfo.class;
            case "injuryHistoryInfo":
                return InjuryHistoryInfo.class;
            case "inoculationInfo":
                return InoculationInfo.class;
            case "neighborInfo":
                return NeighborInfo.class;
            case "operHistoryInfo":
                return OperHistoryInfo.class;
            case "operInfo":
                return OperInfo.class;
            case "professionExposeInfo":
                return ProfessionExposeInfo.class;
            case "healthGuide":
                return HealthGuide.class;
            case "diseaseTypeInfo":
                return DiseaseTypeInfo.class;
            case "drugInfo":
                return DrugInfo.class;
            case "deathInfo":
                return DeathInfo.class;
            case "diagAdverseInfo":
                return DiagAdverseInfo.class;
            case "diagInfo":
                return DiagInfo.class;
            case "infectiousInfo":
                return InfectiousInfo.class;
            case "labItemInfo":
                return LabItemInfo.class;
            case "laboratoryInfo":
                return LaboratoryInfo.class;
            case "physiqueClassifyInfo":
                return PhysiqueClassifyInfo.class;
            case "physiqueDecideInfo":
                return PhysiqueDecideInfo.class;
            case "spiritInfo":
                return SpiritInfo.class;
            case "symptomInfo":
                return SymptomInfo.class;
            case "tdyListTest":
                return TdyListTest.class;
            case "tdyListDrug":
                return TdyListDrug.class;
            case "tdyListOrder":
                return TdyListOrder.class;
            case "tdyListOper":
                return TdyListOper.class;
            case "tdyListNurse":
                return TdyListDiag.class;
            case "tdyListOnurse":
                return TdyListNurse.class;
            case "tdyListCediag":
                return TdyListDiag.class;
            case "tdyListDcddiag":
                return TdyListDiag.class;
            case "tdyListDcsdiag":
                return TdyListDiag.class;
            case "tdyListDiag":
                return TdyListDiag.class;
            case "tdyListDmdiag":
                return TdyListDiag.class;
            case "tdyListDodiag":
                return TdyListDiag.class;
            case "tdyListDwdiag":
                return TdyListDiag.class;
            case "tdyListEdcdiag":
                return TdyListDiag.class;
            case "tdyListEdwdiag":
                return TdyListDiag.class;
            case "tdyListIcddiag":
                return TdyListDiag.class;
            case "tdyListIcsdiag":
                return TdyListDiag.class;
            case "tdyListIwdiag":
                return TdyListDiag.class;
            case "tdyListPdiag":
                return TdyListDiag.class;
            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }

    public BaseMapper getSubBaseDao(String xdsType) throws Exception {
        switch (xdsType) {
            case "allergyInfo":
                return allergyInfoMapper;
            case "adverseVaccine":
                return adverseVaccineMapper;
            case "bloodHistoryInfo":
                return bloodHistoryInfoMapper;
            case "consultationInfo":
                return consultationInfoMapper;
            case "contactHarmInfo":
                return contactHarmInfoMapper;
            case "contactInfo":
                return contactInfoMapper;
            case "disabilityHistoryInfo":
                return disabilityHistoryInfoMapper;
            case "diseaseHistoryInfo":
                return diseaseHistoryInfoMapper;
            case "familyHistoryInfo":
                return familyHistoryInfoMapper;
            case "guardianInfo":
                return guardianInfoMapper;
            case "homeBedInfo":
                return homeBedInfoMapper;
            case "inhospHistoryInfo":
                return inhospHistoryInfoMapper;
            case "inhospInfo":
                return inhospInfoMapper;
            case "injuryHistoryInfo":
                return injuryHistoryInfoMapper;
            case "inoculationInfo":
                return inoculationInfoMapper;
            case "neighborInfo":
                return neighborInfoMapper;
            case "operHistoryInfo":
                return operHistoryInfoMapper;
            case "operInfo":
                return operInfoMapper;
            case "professionExposeInfo":
                return professionExposeInfoMapper;
            case "deathInfo":
                return deathInfoMapper;
            case "diagAdverseInfo":
                return diagAdverseMapper;
            case "diagInfo":
                return diagInfoMapper;
            case "diseaseTypeInfo":
                return diseaseTypeInfoMapper;
            case "drugInfo":
                return drugInfoMapper;
            case "healthGuide":
                return healthGuideMapper;
            case "infectiousInfo":
                return infectiousInfoMapper;
            case "labItemInfo":
                return labItemInfoMapper;
            case "laboratoryInfo":
                return laboratoryInfoMapper;
            case "physiqueClassifyInfo":
                return physiqueClassifyInfoMapper;
            case "physiqueDecideInfo":
                return physiqueDecideInfoMapper;
            case "spiritInfo":
                return spiritInfoMapper;
            case "symptomInfo":
                return symptomInfoMapper;
            case "tdyListTest":
                return tdyListTestMapper;
            case "tdyListDrug":
                return tdyListDrugMapper;
            case "tdyListOrder":
                return tdyListOrderMapper;
            case "tdyListOper":
                return tdyListOperMapper;
            case "tdyListNurse":
                return tdyListDiagMapper;
            case "tdyListOnurse":
                return tdyListNurseMapper;
            case "tdyListCediag":
                return tdyListDiagMapper;
            case "tdyListDcddiag":
                return tdyListDiagMapper;
            case "tdyListDcsdiag":
                return tdyListDiagMapper;
            case "tdyListDiag":
                return tdyListDiagMapper;
            case "tdyListDmdiag":
                return tdyListDiagMapper;
            case "tdyListDodiag":
                return tdyListDiagMapper;
            case "tdyListDwdiag":
                return tdyListDiagMapper;
            case "tdyListEdcdiag":
                return tdyListDiagMapper;
            case "tdyListEdwdiag":
                return tdyListDiagMapper;
            case "tdyListIcddiag":
                return tdyListDiagMapper;
            case "tdyListIcsdiag":
                return tdyListDiagMapper;
            case "tdyListIwdiag":
                return tdyListDiagMapper;
            case "tdyListPdiag":
                return tdyListDiagMapper;

            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }

    @Autowired
    private Hdsd000401ServiceImpl hdsd000401Service;
    @Autowired
    private Hdsd000501ServiceImpl hdsd000501Service;
    @Autowired
    private Hdsd000502ServiceImpl hdsd000502Service;
    @Autowired
    private Hdsd000606ServiceImpl hdsd000606Service;
    @Autowired
    private Hdsd001501ServiceImpl hdsd001501Service;
    @Autowired
    private Hdsd001601ServiceImpl hdsd001601Service;
    @Autowired
    private Hdsd000803ServiceImpl hdsd000803Service;
    @Autowired
    private Hdsd000806ServiceImpl hdsd000806Service;
    @Autowired
    private Hdsd001101ServiceImpl hdsd001101Service;
    @Autowired
    private Hdsd001302ServiceImpl hdsd001302Service;
    @Autowired
    private Hdsd001408ServiceImpl hdsd001408Service;
    @Autowired
    private Hdsd001414ServiceImpl hdsd001414Service;
    @Autowired
    private Hsda0001ServiceImpl hsda0001Service;
    @Autowired
    private Hsdb0101ServiceImpl hsdb0101Service;
    @Autowired
    private Hsdb0102ServiceImpl hsdb0102Service;
    @Autowired
    private Hsdb0103ServiceImpl hsdb0103Service;
    @Autowired
    private Hsdb0201ServiceImpl hsdb0201Service;
    @Autowired
    private Hsdb0202ServiceImpl hsdb0202Service;
    @Autowired
    private Hsdb0203ServiceImpl hsdb0203Service;
    @Autowired
    private Hsdb0204ServiceImpl hsdb0204Service;
    @Autowired
    private Hsdb0301ServiceImpl hsdb0301Service;
    @Autowired
    private Hsdb0302ServiceImpl hsdb0302Service;
    @Autowired
    private Hsdb0303ServiceImpl hsdb0303Service;
    @Autowired
    private Hsdb0401ServiceImpl hsdb0401Service;
    @Autowired
    private Hsdb0402ServiceImpl hsdb0402Service;
    @Autowired
    private Hsdb0403ServiceImpl hsdb0403Service;
    @Autowired
    private Hsdb0404ServiceImpl hsdb0404Service;
    @Autowired
    private Hsdc0001ServiceImpl hsdc0001Service;
    @Autowired
    private Hsdc0002ServiceImpl hsdc0002Service;
    @Autowired
    private Hsdc0003ServiceImpl hsdc0003Service;
    @Autowired
    private Hsdc0004ServiceImpl hsdc0004Service;
    @Autowired
    private Hsdc0005ServiceImpl hsdc0005Service;

    public ServiceImpl getBaseService(String xdsType) throws Exception {
        switch (xdsType) {
            case "HSDA00.01":
                return hsda0001Service;
            case "HSDB01.01":
                return hsdb0101Service;
            case "HSDB01.02":
                return hsdb0102Service;
            case "HSDB01.03":
                return hsdb0103Service;
            case "HSDB02.01":
                return hsdb0201Service;
            case "HSDB02.02":
                return hsdb0202Service;
            case "HSDB02.03":
                return hsdb0203Service;
            case "HSDB02.04":
                return hsdb0204Service;
            case "HSDB03.01":
                return hsdb0301Service;
            case "HSDB03.02":
                return hsdb0302Service;
            case "HSDB03.03":
                return hsdb0303Service;
            case "HSDB04.01":
                return hsdb0401Service;
            case "HSDB04.02":
                return hsdb0402Service;
            case "HSDB04.03":
                return hsdb0403Service;
            case "HSDB04.04":
                return hsdb0404Service;
            case "HSDC00.01":
                return hsdc0001Service;
            case "HSDC00.02":
                return hsdc0002Service;
            case "HSDC00.03":
                return hsdc0003Service;
            case "HSDC00.04":
                return hsdc0004Service;
            case "HSDC00.05":
                return hsdc0005Service;
            case "C0004":
                return hdsd000401Service;
            case "C0006":
                return hdsd000502Service;
            case "C0007":
                return hdsd000501Service;
            case "C0009":
                return hdsd000606Service;
            case "C0052":
                return hdsd001501Service;
            case "C0053":
                return hdsd001601Service;
            case "C0017":
                return hdsd000806Service;
            case "C0020":
                return hdsd000803Service;
            case "C0032":
                return hdsd001101Service;
            case "C0034":
                return hdsd001302Service;
            case "C0037":
                return hdsd001414Service;
            case "C0038":
                return hdsd001408Service;
            default:
                throw new Exception("类型：" + xdsType + ",不存在！");
        }
    }
}
