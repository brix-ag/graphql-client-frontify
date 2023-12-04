package ch.brix.gql.client.frontify.builders;

public class RemoveAssetRelations_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Asset> {
  public RemoveAssetRelations_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "Asset"));
  }
  public RemoveAssetRelations_asset onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_asset onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_asset onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_asset onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_asset onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_asset onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
