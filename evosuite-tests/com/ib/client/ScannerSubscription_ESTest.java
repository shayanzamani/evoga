/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 28 03:11:53 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.ScannerSubscription;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScannerSubscription_ESTest extends ScannerSubscription_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.marketCapAbove(1.7976931348623157E308);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      
      scannerSubscription0.averageOptionVolumeAbove(0);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      double double0 = scannerSubscription0.couponRateBelow();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, double0, 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.scannerSettingPairs("");
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      double double0 = scannerSubscription0.couponRateAbove();
      assertEquals(1.7976931348623157E308, double0, 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.moodyRatingAbove("'79Auk");
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.spRatingBelow();
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.maturityDateAbove();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.spRatingAbove("WzQ$WRe6aP(6");
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      double double0 = scannerSubscription0.marketCapAbove();
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, double0, 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.maturityDateBelow("");
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      double double0 = scannerSubscription0.marketCapBelow();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, double0, 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.moodyRatingBelow("");
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.spRatingAbove();
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.scannerSettingPairs();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      
      scannerSubscription0.belowPrice((-1.0));
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.locationCode("LES-O$]VL");
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.excludeConvertible();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      int int0 = scannerSubscription0.aboveVolume();
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      int int0 = scannerSubscription0.numberOfRows();
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), int0);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.scanCode();
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.couponRateAbove(216.251744898);
      assertEquals(216.251744898, scannerSubscription0.couponRateAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.moodyRatingAbove();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      
      scannerSubscription0.aboveVolume(0);
      assertEquals((-1), scannerSubscription0.numberOfRows());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.moodyRatingBelow();
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.maturityDateAbove("");
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.locationCode();
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.marketCapBelow(614.42429139);
      assertEquals(614.42429139, scannerSubscription0.marketCapBelow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      
      scannerSubscription0.couponRateBelow((double) 0);
      assertEquals((-1), scannerSubscription0.numberOfRows());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      assertEquals((-1), scannerSubscription0.numberOfRows());
      
      scannerSubscription0.numberOfRows(1);
      assertEquals(1, scannerSubscription0.numberOfRows());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.excludeConvertible("");
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      double double0 = scannerSubscription0.abovePrice();
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, double0, 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.stockTypeFilter("*EH~");
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.stockTypeFilter();
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.instrument("");
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.abovePrice(1348.0);
      assertEquals(1348.0, scannerSubscription0.abovePrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.scanCode("");
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.instrument();
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      int int0 = scannerSubscription0.averageOptionVolumeAbove();
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.maturityDateBelow();
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      double double0 = scannerSubscription0.belowPrice();
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ScannerSubscription scannerSubscription0 = new ScannerSubscription();
      scannerSubscription0.spRatingBelow("");
      assertEquals(1.7976931348623157E308, scannerSubscription0.belowPrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateBelow(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapAbove(), 0.01);
      assertEquals((-1), scannerSubscription0.numberOfRows());
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.averageOptionVolumeAbove());
      assertEquals(1.7976931348623157E308, scannerSubscription0.abovePrice(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.couponRateAbove(), 0.01);
      assertEquals(1.7976931348623157E308, scannerSubscription0.marketCapBelow(), 0.01);
      assertEquals(Integer.MAX_VALUE, scannerSubscription0.aboveVolume());
  }
}