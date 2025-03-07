package ch.brix.gql.client.frontify.builders;

public class AddAssetRelations_relatedAssets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public AddAssetRelations_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "Asset"));
  }
  public AddAssetRelations_relatedAssets onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_relatedAssets onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_relatedAssets onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_relatedAssets onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_relatedAssets onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_relatedAssets onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddAssetRelations_relatedAssets onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
