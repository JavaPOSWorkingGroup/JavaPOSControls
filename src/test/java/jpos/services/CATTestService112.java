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

package jpos.services;

import jpos.JposConst;
import jpos.JposException;
import jpos.loader.JposServiceInstance;
import jpos.services.EventCallbacks;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in CATTest.
 *
 */
public final class CATTestService112 implements jpos.services.CATService112, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1_012_000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        // intentionally left empty
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }

    
    @Override
    public String getAccountNumber() throws JposException {
        return "";
    }
    
    @Override
    public String getAdditionalSecurityInformation() throws JposException {
        return "";
    }
    
    @Override
    public void setAdditionalSecurityInformation(String securityInfo) throws JposException {
    }
    
    @Override
    public String getApprovalCode() throws JposException {
        return "";
    }
    
    @Override
    public boolean getAsyncMode() throws JposException {
        return true;
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
    }
    
    @Override
    public long getBalance() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapAdditionalSecurityInformation() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAuthorizeCompletion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAuthorizePreSales() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAuthorizeRefund() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAuthorizeVoid() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAuthorizeVoidPreSales() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCashDeposit() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCenterResultCode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCheckCard() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public int getCapDailyLog() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapInstallments() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapLockTerminal() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapLogStatus() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPaymentDetail() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTaxOthers() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTrainingMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTransactionNumber() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUnlockTerminal() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return true;
    }
    
    @Override
    public String getCardCompanyID() throws JposException {
        return "";
    }
    
    @Override
    public String getCenterResultCode() throws JposException {
        return "";
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public String getDailyLog() throws JposException {
        return "";
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public int getLogStatus() throws JposException {
        return 0;
    }
    
    @Override
    public int getPaymentCondition() throws JposException {
        return 0;
    }
    
    @Override
    public String getPaymentDetail() throws JposException {
        return "";
    }
    
    @Override
    public int getPaymentMedia() throws JposException {
        return 0;
    }
    
    @Override
    public void setPaymentMedia(int paymentMedia) throws JposException {
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        return "";
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
    }
    
    @Override
    public int getPowerState() throws JposException {
        return 0;
    }
    
    @Override
    public int getSequenceNumber() throws JposException {
        return 0;
    }
    
    @Override
    public long getSettledAmount() throws JposException {
        return 0;
    }
    
    @Override
    public String getSlipNumber() throws JposException {
        return "";
    }
    
    @Override
    public boolean getTrainingMode() throws JposException {
        return true;
    }
    
    @Override
    public void setTrainingMode(boolean trainingMode) throws JposException {
    }
    
    @Override
    public String getTransactionNumber() throws JposException {
        return "";
    }
    
    @Override
    public String getTransactionType() throws JposException {
        return "";
    }
    
    @Override
    public void accessDailyLog(int sequenceNumber, int type, int timeout) throws JposException 
    {
    }
    
    @Override
    public void authorizeCompletion(int sequenceNumber, long amount, long taxOthers, int timeout) throws JposException 
    {
    }
    
    @Override
    public void authorizePreSales(int sequenceNumber, long amount, long taxOthers, int timeout) throws JposException 
    {
    }
    
    @Override
    public void authorizeRefund(int sequenceNumber, long amount, long taxOthers, int timeout) throws JposException 
    {
    }
    
    @Override
    public void authorizeSales(int sequenceNumber, long amount, long taxOthers, int timeout) throws JposException 
    {
    }
    
    @Override
    public void authorizeVoid(int sequenceNumber, long amount, long taxOthers, int timeout) throws JposException 
    {
    }
    
    @Override
    public void authorizeVoidPreSales(int sequenceNumber, long amount, long taxOthers, int timeout) throws JposException 
    {
    }
    
    @Override
    public void cashDeposit(int sequenceNumber, long amount, int timeout) throws JposException 
    {
    }
    
    @Override
    public void checkCard(int sequenceNumber, int timeout) throws JposException 
    {
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
    }
    
    @Override
    public void clearOutput() throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void lockTerminal() throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void unlockTerminal() throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
}
