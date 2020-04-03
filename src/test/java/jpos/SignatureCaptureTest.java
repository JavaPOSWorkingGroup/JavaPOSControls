////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpos.config.JposEntryRegistry;
import jpos.config.simple.SimpleEntry;
import jpos.loader.JposServiceLoader;
import jpos.services.EventCallbacks;

/**
 * SignatureCapture device control JUnit test.
 * <br>
 * Generated through jpos.build.controls.JavaPOSDeviceControlTestGenerator for JavaPOS version 1.14
 */
public class SignatureCaptureTest {

    private static final String SERVICE_ALL_METHODS_THROWING_NPE = "SignatureCaptureTestServiceAlwaysThrowingNPE";
    private static final String SERVICE_ALL_METHODS_RETHROWING_JPOSEXCEPTION = "SignatureCaptureTestServiceRethrowingJposException";
    private static final String SERVICE_12 = "SignatureCaptureTestService12";
    private static final String SERVICE_13 = "SignatureCaptureTestService13";
    private static final String SERVICE_14 = "SignatureCaptureTestService14";
    private static final String SERVICE_15 = "SignatureCaptureTestService15";
    private static final String SERVICE_16 = "SignatureCaptureTestService16";
    private static final String SERVICE_17 = "SignatureCaptureTestService17";
    private static final String SERVICE_18 = "SignatureCaptureTestService18";
    private static final String SERVICE_19 = "SignatureCaptureTestService19";
    private static final String SERVICE_110 = "SignatureCaptureTestService110";
    private static final String SERVICE_111 = "SignatureCaptureTestService111";
    private static final String SERVICE_112 = "SignatureCaptureTestService112";
    private static final String SERVICE_113 = "SignatureCaptureTestService113";
    private static final String SERVICE_114 = "SignatureCaptureTestService114";
    
    private static final String OPENNAME_ALL_METHODS_THROWING_NPE = SERVICE_ALL_METHODS_THROWING_NPE;
    private static final String OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION = SERVICE_ALL_METHODS_RETHROWING_JPOSEXCEPTION;
    private static final String OPENNAME_SERVICE_10 = SERVICE_12;
    private static final String OPENNAME_SERVICE_12 = SERVICE_12;
    private static final String OPENNAME_SERVICE_13 = SERVICE_13;
    private static final String OPENNAME_SERVICE_14 = SERVICE_14;
    private static final String OPENNAME_SERVICE_15 = SERVICE_15;
    private static final String OPENNAME_SERVICE_16 = SERVICE_16;
    private static final String OPENNAME_SERVICE_17 = SERVICE_17;
    private static final String OPENNAME_SERVICE_18 = SERVICE_18;
    private static final String OPENNAME_SERVICE_19 = SERVICE_19;
    private static final String OPENNAME_SERVICE_110 = SERVICE_110;
    private static final String OPENNAME_SERVICE_111 = SERVICE_111;
    private static final String OPENNAME_SERVICE_112 = SERVICE_112;
    private static final String OPENNAME_SERVICE_113 = SERVICE_113;
    private static final String OPENNAME_SERVICE_114 = SERVICE_114;
    
    private static final String OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService12ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService13ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService14ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService15ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService16ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService17ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService18ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService19ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService110ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService111ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService112ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE = "SignatureCaptureTestService113ReturningVersionTooLarge";
    
    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_ALL_METHODS_THROWING_NPE, "1.14", SERVICE_ALL_METHODS_THROWING_NPE));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION, "1.14", SERVICE_ALL_METHODS_RETHROWING_JPOSEXCEPTION));
        
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_12, "1.2", SERVICE_12));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_13, "1.3", SERVICE_13));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_14, "1.4", SERVICE_14));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_15, "1.5", SERVICE_15));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_16, "1.6", SERVICE_16));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_17, "1.7", SERVICE_17));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_18, "1.8", SERVICE_18));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_19, "1.9", SERVICE_19));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_110, "1.10", SERVICE_110));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_111, "1.11", SERVICE_111));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_112, "1.12", SERVICE_112));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_113, "1.13", SERVICE_113));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_114, "1.14", SERVICE_114));
        
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE, "1.2", SERVICE_12, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE, "1.3", SERVICE_13, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE, "1.4", SERVICE_14, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE, "1.5", SERVICE_15, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE, "1.6", SERVICE_16, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE, "1.7", SERVICE_17, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE, "1.8", SERVICE_18, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE, "1.9", SERVICE_19, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE, "1.10", SERVICE_110, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE, "1.11", SERVICE_111, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE, "1.12", SERVICE_112, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("SignatureCapture", OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE, "1.13", SERVICE_113, new SimpleEntry.Prop("returnVersionTooLarge", "")));
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        
        registry.removeJposEntry(OPENNAME_ALL_METHODS_THROWING_NPE);
        registry.removeJposEntry(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
        
        registry.removeJposEntry(OPENNAME_SERVICE_12);
        registry.removeJposEntry(OPENNAME_SERVICE_13);
        registry.removeJposEntry(OPENNAME_SERVICE_14);
        registry.removeJposEntry(OPENNAME_SERVICE_15);
        registry.removeJposEntry(OPENNAME_SERVICE_16);
        registry.removeJposEntry(OPENNAME_SERVICE_17);
        registry.removeJposEntry(OPENNAME_SERVICE_18);
        registry.removeJposEntry(OPENNAME_SERVICE_19);
        registry.removeJposEntry(OPENNAME_SERVICE_110);
        registry.removeJposEntry(OPENNAME_SERVICE_111);
        registry.removeJposEntry(OPENNAME_SERVICE_112);
        registry.removeJposEntry(OPENNAME_SERVICE_113);
        registry.removeJposEntry(OPENNAME_SERVICE_114);
        
        registry.removeJposEntry(OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE);
        
    }

    private SignatureCapture control;

    @Before
    public void setUp() throws Exception {
        this.control = new SignatureCapture();
    }

    @After
    public void tearDown() throws Exception {
        this.control = null;
    }

    /**
     * Test method for {@link jpos.SignatureCapture#createEventCallbacks()}.
     */
    @Test
    public final void testCreateEventCallbacks() {
        EventCallbacks callbacks = this.control.createEventCallbacks();
        assertThat(callbacks, is(notNullValue()));
    }
    
    @Test
    public final void testGetAutoDisableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoDisable();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAutoDisableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAutoDisable(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapCompareFirmwareVersion();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapDisplayFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapDisplay();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapPowerReporting();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapRealTimeDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapRealTimeData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapStatisticsReporting();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUpdateFirmware();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUpdateStatistics();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUserTerminatedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUserTerminated();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCheckHealthText();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetClaimedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getClaimed();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDataCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDataCount();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDataEventEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDataEventEnabled(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDeviceEnabled(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceServiceDescription();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetFreezeEventsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getFreezeEvents();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetFreezeEventsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setFreezeEvents(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMaximumXFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMaximumX();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMaximumYFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMaximumY();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPhysicalDeviceDescription();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPhysicalDeviceName();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPointArrayFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPointArray();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerNotify();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetPowerNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setPowerNotify(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerStateFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerState();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetRawDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getRawData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetRealTimeDataEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getRealTimeDataEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetRealTimeDataEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setRealTimeDataEnabled(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testBeginCaptureFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.beginCapture("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCheckHealthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.checkHealth(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testClaimFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.claim(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testClearInputFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.clearInput();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testClearInputPropertiesFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.clearInputProperties();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCloseFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.close();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.compareFirmwareVersion("",new int[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testDirectIOFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.directIO(0,new int[0],new Object());
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testEndCaptureFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.endCapture();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testReleaseFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.release();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testResetStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.resetStatistics("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveStatistics(new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testUpdateFirmwareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.updateFirmware("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testUpdateStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.updateStatistics("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoDisableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoDisable();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAutoDisableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAutoDisable(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapCompareFirmwareVersion();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapDisplayFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapDisplay();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapPowerReporting();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapRealTimeDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapRealTimeData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapStatisticsReporting();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUpdateFirmware();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUpdateStatistics();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUserTerminatedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUserTerminated();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCheckHealthText();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetClaimedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getClaimed();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDataCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDataCount();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDataEventEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDataEventEnabled(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDeviceEnabled(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceServiceDescription();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetFreezeEventsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getFreezeEvents();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetFreezeEventsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setFreezeEvents(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMaximumXFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMaximumX();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMaximumYFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMaximumY();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPhysicalDeviceDescription();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPhysicalDeviceName();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPointArrayFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPointArray();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerNotify();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetPowerNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setPowerNotify(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerStateFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerState();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetRawDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getRawData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetRealTimeDataEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getRealTimeDataEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetRealTimeDataEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setRealTimeDataEnabled(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testBeginCaptureFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.beginCapture("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCheckHealthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.checkHealth(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testClaimFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.claim(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testClearInputFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.clearInput();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testClearInputPropertiesFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.clearInputProperties();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCloseFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.close();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testDirectIOFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.directIO(0,new int[0],new Object());
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testEndCaptureFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.endCapture();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testReleaseFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.release();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testResetStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.resetStatistics("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveStatistics(new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testUpdateFirmwareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.updateFirmware("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testUpdateStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.updateStatistics("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoDisableRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getAutoDisable();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetAutoDisableRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setAutoDisable(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapCompareFirmwareVersion();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapDisplayRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapDisplay();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapPowerReporting();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapRealTimeDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapRealTimeData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapStatisticsReporting();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapUpdateFirmware();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapUpdateStatistics();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapUserTerminatedRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapUserTerminated();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCheckHealthText();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetClaimedRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getClaimed();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDataCountRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDataCount();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDataEventEnabled();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setDataEventEnabled(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDeviceEnabled();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setDeviceEnabled(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDeviceServiceDescription();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetFreezeEventsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getFreezeEvents();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetFreezeEventsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setFreezeEvents(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetMaximumXRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getMaximumX();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetMaximumYRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getMaximumY();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPhysicalDeviceDescription();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPhysicalDeviceName();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPointArrayRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPointArray();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPowerNotifyRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPowerNotify();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetPowerNotifyRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setPowerNotify(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPowerStateRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPowerState();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetRawDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getRawData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetRealTimeDataEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getRealTimeDataEnabled();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetRealTimeDataEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setRealTimeDataEnabled(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testBeginCaptureRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.beginCapture("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testCheckHealthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.checkHealth(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testClaimRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.claim(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testClearInputRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.clearInput();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testClearInputPropertiesRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.clearInputProperties();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testCloseRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.close();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testDirectIORethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.directIO(0,new int[0],new Object());
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testEndCaptureRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.endCapture();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testReleaseRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.release();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testResetStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.resetStatistics("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.retrieveStatistics(new String[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testUpdateFirmwareRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.updateFirmware("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testUpdateStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.updateStatistics("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceVersion12() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            assertThat(this.control.getDeviceServiceVersion(), is(1002000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            assertThat(this.control.getDeviceServiceVersion(), is(1003000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            assertThat(this.control.getDeviceServiceVersion(), is(1004000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            assertThat(this.control.getDeviceServiceVersion(), is(1005000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            assertThat(this.control.getDeviceServiceVersion(), is(1006000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            assertThat(this.control.getDeviceServiceVersion(), is(1007000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            assertThat(this.control.getDeviceServiceVersion(), is(1008000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            assertThat(this.control.getDeviceServiceVersion(), is(1009000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            assertThat(this.control.getDeviceServiceVersion(), is(1010000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            assertThat(this.control.getDeviceServiceVersion(), is(1011000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            assertThat(this.control.getDeviceServiceVersion(), is(1012000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            assertThat(this.control.getDeviceServiceVersion(), is(1013000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            assertThat(this.control.getDeviceServiceVersion(), is(1014000));
        }
        catch (JposException e) {
            fail("SignatureCapture.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public void testOpenOnService12ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService13ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService14ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService15ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService16ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService17ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService18ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService19ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService110ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService111ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService112ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService113ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapCompareFirmwareVersion();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapPowerReportingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapPowerReporting();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapStatisticsReportingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapStatisticsReporting();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapUpdateFirmwareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUpdateFirmware();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapUpdateStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapUpdateStatistics();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUserTerminatedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUserTerminated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetClaimedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetDataCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetMaximumXCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumXCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMaximumX();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetMaximumYCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumYCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMaximumY();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPointArrayCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPointArrayCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPointArray();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetPowerNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getPowerNotify();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setPowerNotify(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getPowerState();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetPowerStateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetRawDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRawDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getRawData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetRealTimeDataEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getRealTimeDataEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetRealTimeDataEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setRealTimeDataEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testBeginCaptureCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testBeginCaptureCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.beginCapture("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCheckHealthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testClaimCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testClearInputCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.clearInputProperties();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCloseCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testDirectIOCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testEndCaptureCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEndCaptureCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.endCapture();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testReleaseCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.resetStatistics("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testResetStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.retrieveStatistics(new String[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.updateFirmware("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.updateStatistics("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
}
