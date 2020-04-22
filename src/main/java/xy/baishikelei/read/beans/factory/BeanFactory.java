package xy.baishikelei.read.beans.factory;

public interface BeanFactory {
  String FACTORY_BEAN_PREFIX = "&";

  Object getBean(String var1) throws Exception;

  <T> T getBean(String var1,Class<T> var2) throws Exception;

  Object getBean(String var1,Object... var2) throws  Exception;
}
