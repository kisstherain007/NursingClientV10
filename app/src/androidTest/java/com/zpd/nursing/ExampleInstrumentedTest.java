package com.zpd.nursing;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.zpd.nursing.util.HanziToPinyin;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * assertArrayEquals(expecteds, actuals) 查看两个数组是否相等。
 * assertEquals(expected, actual) 查看两个对象是否相等。类似于字符串比较使用的equals()方法
 * assertNotEquals(first, second) 查看两个对象是否不相等。
 * assertNull(object) 查看对象是否为空。
 * assertNotNull(object) 查看对象是否不为空。
 * assertSame(expected, actual) 查看两个对象的引用是否相等。类似于使用“==”比较两个对象
 * assertNotSame(unexpected, actual) 查看两个对象的引用是否不相等。类似于使用“!=”比较两个对象
 * assertTrue(condition) 查看运行结果是否为true。
 * assertFalse(condition) 查看运行结果是否为false。
 * assertThat(actual, matcher) 查看实际值是否满足指定的条件
 * fail() 让测试失败
 *
 * @Before 初始化方法
 * @After 释放资源
 * @Test 测试方法，在这里可以测试期望异常和超时时间
 * @Ignore 忽略的测试方法
 * @BeforeClass 针对所有测试，只执行一次，且必须为static void
 * @AfterClass 针对所有测试，只执行一次，且必须为static void
 * @RunWith 指定测试类使用某个运行器
 * @Parameters 指定测试类的测试数据集合
 * @Rule 允许灵活添加或重新定义测试类中的每个测试方法的行为
 * @FixMethodOrder 指定测试方法的执行顺序
 * 一个测试类单元测试的执行顺序为： @BeforeClass –> @Before –> @Test –> @After –> @AfterClass
 * 每一个测试方法的调用顺序为： @Before –> @Test –> @After
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.zpd.nursing", appContext.getPackageName());
    }

    //     type;
//     source;
//     target;
    @Test
    public void testPinyin() {
        ArrayList<HanziToPinyin.Token> result = HanziToPinyin.getInstance().get("我是周润发");
        for (HanziToPinyin.Token token : result) {
            Log.d("测试", "type:" + token.type);
            Log.d("测试", "source:" + token.source);
            Log.d("测试", "target:" + token.target);
        }
    }
}
