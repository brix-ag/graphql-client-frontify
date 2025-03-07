package ch.brix.gql.client.frontify.builders;

public class AddAssetRelations_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Asset> {
  public AddAssetRelations_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "Asset"));
  }
  public AddAssetRelations_asset onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_asset onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_asset onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_asset onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_asset onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_asset onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
