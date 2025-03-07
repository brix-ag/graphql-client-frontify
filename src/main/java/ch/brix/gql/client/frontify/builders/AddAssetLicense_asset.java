package ch.brix.gql.client.frontify.builders;

public class AddAssetLicense_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Asset> {
  public AddAssetLicense_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "Asset"));
  }
  public AddAssetLicense_asset onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetLicense_asset onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetLicense_asset onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetLicense_asset onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetLicense_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetLicense_asset onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetLicense_asset onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
