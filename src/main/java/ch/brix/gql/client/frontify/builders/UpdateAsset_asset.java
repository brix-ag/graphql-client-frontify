package ch.brix.gql.client.frontify.builders;

public class UpdateAsset_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Asset> {
  public UpdateAsset_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "Asset"));
  }
  public UpdateAsset_asset onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAsset_asset onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAsset_asset onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAsset_asset onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAsset_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAsset_asset onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAsset_asset onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
