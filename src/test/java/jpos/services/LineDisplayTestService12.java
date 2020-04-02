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
 * JavaPOS Device Service class, intended to be used for testing purposes in LineDisplayTest.
 *
 */
public final class LineDisplayTestService12 implements jpos.services.LineDisplayService12, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1_002_000;
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
    public int getCapBlink() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapBrightness() throws JposException {
        return true;
    }
    
    @Override
    public int getCapCharacterSet() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapDescriptors() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapHMarquee() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapICharWait() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapVMarquee() throws JposException {
        return true;
    }
    
    @Override
    public int getCharacterSet() throws JposException {
        return 0;
    }
    
    @Override
    public void setCharacterSet(int characterSet) throws JposException {
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
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
    public int getColumns() throws JposException {
        return 0;
    }
    
    @Override
    public int getCurrentWindow() throws JposException {
        return 0;
    }
    
    @Override
    public void setCurrentWindow(int currentWindow) throws JposException {
    }
    
    @Override
    public int getCursorColumn() throws JposException {
        return 0;
    }
    
    @Override
    public void setCursorColumn(int cursorColumn) throws JposException {
    }
    
    @Override
    public int getCursorRow() throws JposException {
        return 0;
    }
    
    @Override
    public void setCursorRow(int cursorRow) throws JposException {
    }
    
    @Override
    public boolean getCursorUpdate() throws JposException {
        return true;
    }
    
    @Override
    public void setCursorUpdate(boolean cursorUpdate) throws JposException {
    }
    
    @Override
    public int getDeviceBrightness() throws JposException {
        return 0;
    }
    
    @Override
    public void setDeviceBrightness(int deviceBrightness) throws JposException {
    }
    
    @Override
    public int getDeviceColumns() throws JposException {
        return 0;
    }
    
    @Override
    public int getDeviceDescriptors() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public int getDeviceRows() throws JposException {
        return 0;
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public int getDeviceWindows() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public int getInterCharacterWait() throws JposException {
        return 0;
    }
    
    @Override
    public void setInterCharacterWait(int interCharacterWait) throws JposException {
    }
    
    @Override
    public int getMarqueeFormat() throws JposException {
        return 0;
    }
    
    @Override
    public void setMarqueeFormat(int marqueeFormat) throws JposException {
    }
    
    @Override
    public int getMarqueeRepeatWait() throws JposException {
        return 0;
    }
    
    @Override
    public void setMarqueeRepeatWait(int marqueeRepeatWait) throws JposException {
    }
    
    @Override
    public int getMarqueeType() throws JposException {
        return 0;
    }
    
    @Override
    public void setMarqueeType(int marqueeType) throws JposException {
    }
    
    @Override
    public int getMarqueeUnitWait() throws JposException {
        return 0;
    }
    
    @Override
    public void setMarqueeUnitWait(int marqueeUnitWait) throws JposException {
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
    public int getRows() throws JposException {
        return 0;
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
    public void clearDescriptors() throws JposException 
    {
    }
    
    @Override
    public void clearText() throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void createWindow(int viewportRow, int viewportColumn, int viewportHeight, int viewportWidth, int windowHeight, int windowWidth) throws JposException 
    {
    }
    
    @Override
    public void destroyWindow() throws JposException 
    {
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void displayText(String data, int attribute) throws JposException 
    {
    }
    
    @Override
    public void displayTextAt(int row, int column, String data, int attribute) throws JposException 
    {
    }
    
    @Override
    public void refreshWindow(int window) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void scrollText(int direction, int units) throws JposException 
    {
    }
    
    @Override
    public void setDescriptor(int descriptor, int attribute) throws JposException 
    {
    }
}
