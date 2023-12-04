package ch.brix.gql.client.frontify.builders;

public class SyncAssetTags_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Asset> {
  public SyncAssetTags_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "Asset"));
  }
  public SyncAssetTags_asset onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SyncAssetTags_asset onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SyncAssetTags_asset onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SyncAssetTags_asset onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SyncAssetTags_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SyncAssetTags_asset onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SyncAssetTags_asset onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
