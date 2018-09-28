/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 28 03:16:29 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoParams = contract0.m_comboLegs;
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, "O", 1.7976931348623157E308, Integer.MAX_VALUE, 0, (String) null, (String) null);
      order0.m_algoStrategy = "O";
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("3A&+cc", (String) null, " low=", "id=-2947  bidOptComp: vol = 74.1683180663896 delta = N/A", 1.7976931348623157E308, 427.43775515524, 0, "id=443  unknown: vol = 1.0 delta = N/A", (String) null);
      order0.m_algoStrategy = "id=-2947  bidOptComp: vol = 74.1683180663896 delta = N/A";
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder((-1), contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(18, ".", "BAG", "BAG", 18, "BAG", "BAG", "BAG", "BAG", ".", vector0, ".", true, "BAG", "id=-1  unknown=-1.0  canAutoExecute");
      Order order0 = new Order();
      order0.m_basisPoints = (-2161.37658423034);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(18, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(0, ".", "BAG", "com.ib.client.ContractDetails", (-1.0), "com.ib.client.ContractDetails", " delta=", "BAG", "BAG", "r8", vector0, ".", false, "BAG", "secType = ");
      contract0.m_comboLegsDescrip = "GROUPS";
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0L, (-1804.2), 1.7976931348623157E308, (-1804.2));
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 128.872, (-1170.64681680384), 0.0, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = 128.872 delta = N/A: modelPrice = 0.0: pvDividend = N/A", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0.0, 1.0, (-1290.74), 1336.715);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 1.0: modelPrice = N/A: pvDividend = 1336.715", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 0, (-1.0), (-1.0));
      assertEquals("id=0  bidSize: vol = N/A delta = 0.0", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-277), 2, (-724.6945472235083), (-989.241), 243.348, 0.0);
      assertEquals("id=-277  askPrice: vol = N/A delta = N/A", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-1), (-416), (-416), 10);
      assertEquals("id=-1  unknown=-416.0  canAutoExecute", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(2625, 2625, 2625, 0);
      assertEquals("id=2625  unknown=2625.0  noAutoExecute", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(1996, (-1251), 1996, 0, 685.2608504733515, 1996);
      assertEquals("updateMktDepth: 1996 -1251 1996 0 685.2608504733515 1996", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString((-956), 121, "a-rHk|");
      assertEquals("id=-956  unknown=a-rHk|", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(0, (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, "XC]D[!rmj3-Wl", "com.ib.client.UnderComp");
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=com.ib.client.UnderComp :: Message=XC]D[!rmj3-Wl", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(0, "40");
      assertEquals("id  = 0 len = 2\n40", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contractDetails0.m_summary, 0, 0.0, 0.0, 0.0, 0, (-272.6), "com.ib.client.TagValue");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 0.0 0.0 0.0 -272.6 com.ib.client.TagValue", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("Connected : The list of managed accounts are : [XC]D[!rmj3-Wl]", "anOxV{g73gvhb", "Connected : The list of managed accounts are : [XC]D[!rmj3-Wl]", "Connected : The list of managed accounts are : [XC]D[!rmj3-Wl]");
      assertEquals("updateAccountValue: Connected : The list of managed accounts are : [XC]D[!rmj3-Wl] anOxV{g73gvhb Connected : The list of managed accounts are : [XC]D[!rmj3-Wl] Connected : The list of managed accounts are : [XC]D[!rmj3-Wl]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(0, "[dc");
      assertEquals("FA: null [dc", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(1220);
      assertEquals("id=1220 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "toua6Uwr", 0, 121, 0.0, 0, (-1386), (-715.15), 0, "");
      assertEquals("order status: orderId=0 clientId=0 permId=0 status=toua6Uwr filled=0 remaining=121 avgFillPrice=0.0 lastFillPrice=-715.15 parent Id=-1386 whyHeld=", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(102, 2518, 2518);
      assertEquals("id=102  unknown=2518.0", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("XC]D[!rmj3-Wl");
      assertEquals("Connected : The list of managed accounts are : [XC]D[!rmj3-Wl]", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(121, contractDetails0);
      assertEquals("reqId = 121 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(915, (-284), "", (-354), (-284), 83.6, 0);
      assertEquals("updateMktDepth: 915 -284  -354 -284 83.6 0", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-1386), contractDetails0);
      assertEquals("reqId = -1386 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(531, 2085, contractDetails0, (String) null, (String) null, (String) null, "FA:");
      assertEquals("id = 531 rank=2085 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=FA:", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, 0L, 0, 0.0, 0.0, 2085, 0, 474.5978148477341, 2085);
      assertEquals("id=0 time = 0 open=0.0 high=0.0 low=0.0 close=2085.0 volume=0 count=2085 WAP=474.5978148477341", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(1L);
      assertEquals("current time = 1 (Jan 1, 1970 12:00:01 AM)", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP((-502), 98, (-773.84), "com.ib.client.ContractDetails", 1.0, 98, (String) null, 1.0, 0.0);
      assertEquals("id=-502  unknown: basisPoints = -773.84/com.ib.client.ContractDetails impliedFuture = 1.0 holdDays = 98 futureExpiry = null dividendImpact = 1.0 dividends to expiry = 0.0", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-502), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -502\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(915, (-109), (-109));
      assertEquals("id=915  unknown=-109", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("");
      assertEquals("SCANNER PARAMETERS:\n", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, "Connected : The list of managed accounts are : [XC]D[!rmj3-Wl]", (-1.0), (-1.0), (-1.0), 3144.7980079, 3378, 0, 0, true);
      assertEquals("id=0 date = Connected : The list of managed accounts are : [XC]D[!rmj3-Wl] open=-1.0 high=-1.0 low=-1.0 close=3144.7980079 volume=3378 count=0 WAP=0.0 hasGaps=true", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("ov{XSyifG");
      assertEquals("updateAccountTime: ov{XSyifG", string0);
  }
}