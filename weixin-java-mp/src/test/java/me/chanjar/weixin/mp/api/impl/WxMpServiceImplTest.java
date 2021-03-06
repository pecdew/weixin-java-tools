package me.chanjar.weixin.mp.api.impl;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.ApiTestModule;
import me.chanjar.weixin.mp.api.ApiTestModule.WxXmlMpInMemoryConfigStorage;

import org.testng.Assert;

@Test
@Guice(modules = ApiTestModule.class)
public class WxMpServiceImplTest {

  @Inject
  private WxMpServiceImpl wxService;

  @Test
  public void testCheckSignature() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetAccessTokenBoolean() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetJsapiTicket() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetJsapiTicketBoolean() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testCreateJsapiSignature() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testCustomMessageSend() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassNewsUpload() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassVideoUpload() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassGroupMessageSend() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassOpenIdsMessageSend() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testMassMessagePreview() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testShortUrl() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testTemplateSend() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testSetIndustry() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetIndustry() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testSemanticQuery() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2buildAuthorizationUrl() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testBuildQrConnectUrl() {
    String qrConnectUrl = this.wxService
        .buildQrConnectUrl(
            ((WxXmlMpInMemoryConfigStorage) this.wxService
                .getWxMpConfigStorage()).getOauth2redirectUri(),
            WxConsts.QRCONNECT_SCOPE_SNSAPI_LOGIN, null);
    Assert.assertNotNull(qrConnectUrl);
    System.out.println(qrConnectUrl);
  }

  @Test
  public void testOauth2getAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2refreshAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2getUserInfo() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testOauth2validateAccessToken() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGetCallbackIP() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testGet() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testPost() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testExecute() {
    Assert.fail("Not yet implemented");
  }

}
