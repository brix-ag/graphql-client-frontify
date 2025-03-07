package ch.brix.gql.client.frontify.builders;

public class RemoveAssetPreviewImage_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Asset> {
  public RemoveAssetPreviewImage_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "Asset"));
  }
  public RemoveAssetPreviewImage_asset onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetPreviewImage_asset onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetPreviewImage_asset onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetPreviewImage_asset onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetPreviewImage_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetPreviewImage_asset onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetPreviewImage_asset onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
