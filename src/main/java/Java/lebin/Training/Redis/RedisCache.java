//package Java.lebin.Training.Redis;
//
//import java.util.HashMap;
//import java.util.List;
//
//import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
//
//public class RedisCache {
//
//    @Override
//    public PublicResult<HashMap<Integer, Integer>> getUserAreaFranchiseeIDS(List<Integer> uids) {
//        PublicResult<HashMap<Integer, Integer>> result = new PublicResult<HashMap<Integer, Integer>>();
//        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
//
//        long time;
//        for(Integer uid :uids){
//            Integer areaId = Integer.valueOf(0);
//            try {
//                time=System.currentTimeMillis();
//                UserAreaFranchisee area =getUserAreaFranchisee(uid).getResult();
//                LOGGER.info("=getUserAreaFranchiseeIDS=>--.uid:["+uid+"].[get -- wmpsDayInterChange]getUserAreaFranchisee() -------------spen time:" + (System.currentTimeMillis()-time));
//                time=System.currentTimeMillis();
//                int id = 0;
//                if (area != null && area.getCityid() != null && area.getCityid().intValue() > 0) {
//                    id = area.getCityid().intValue();
//                    tpr = logicTongchengAreaService.getTongchengArea(Integer.valueOf(id));
//                    if (tpr != null && tpr.isSuccess() && tpr.getResult() != null && tpr.getResult().getId() != null && tpr.getResult().getId() > 0) {
//                        areaId = tpr.getResult().getId();
//                    }
//                }
//                LOGGER.info("=getUserAreaFranchiseeIDS=>--..uid:["+uid+"].[get -- wmpsDayInterChange]getLogicTongchengAreaService() -------------spen time:" + (System.currentTimeMillis()-time));
//
//            }catch (Exception e){
//                LOGGER.error("=getUserAreaFranchiseeIDS=>",e);
//            }
//            resultMap.put(uid,areaId);
//        }
//
//
//        result.setSuccess(true);
//        result.setResult(resultMap);
//        return result;
//    }
//
//
//
//}
