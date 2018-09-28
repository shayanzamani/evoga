/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 28 03:14:00 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.TagValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagValue_ESTest extends TagValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TagValue tagValue0 = new TagValue();
      TagValue tagValue1 = new TagValue();
      boolean boolean0 = tagValue0.equals(tagValue1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TagValue tagValue0 = new TagValue();
      TagValue tagValue1 = new TagValue((String) null, "pr=TfPt)-zrtUv");
      boolean boolean0 = tagValue0.equals(tagValue1);
      assertFalse(boolean0);
      assertFalse(tagValue1.equals((Object)tagValue0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TagValue tagValue0 = new TagValue();
      boolean boolean0 = tagValue0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TagValue tagValue0 = new TagValue();
      TagValue tagValue1 = new TagValue("iPX", (String) null);
      boolean boolean0 = tagValue0.equals(tagValue1);
      assertFalse(tagValue1.equals((Object)tagValue0));
      assertFalse(boolean0);
  }
}