package xy.baishikelei.read.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;


/**
 * 问题与实践
 */
public class OtherTest {

  /**
   * problem one.
   * Java不定参数Object... obj 和 Object[]的区别
   *
   * object ...objects这种参数定义是在不确定方法参数的情况下的一种多态表现形式
   * Object[] obj这样的形式，就是一个Object数组构成的参数形式。说明这个方法的参数是固定的
   */
  public void ObjectParam(Object... obj) {
    System.out.println(Arrays.toString(obj));
  }
  @Test
  public void testOne() {
    Object str = "sss";
    Object st = "ss";
    OtherTest otherTest = new OtherTest();
    otherTest.ObjectParam(str, st, null, "", " ");
  }

  /**
   * problem two.
   * <T> T的用法
   *
   * <T> T表示返回值T是泛型，T只是一个占位符，用来告诉编译器，这个东西先给我留着，等我编译的时候再告诉你是什么类型
   */

  private <T> T getListFirst(List<T> data){
    if(data == null || data.size() == 0){
      return null;
    }
    return data.get(0);
  }

  @Test
  public void testTwo(){
    List<String> array = new ArrayList<String>();
    array.add("aaa");
    array.add("bbb");


    List<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(2);

    OtherTest otherTest = new OtherTest();
    String listFirst = otherTest.getListFirst(array);
    System.out.println();
  }
}
