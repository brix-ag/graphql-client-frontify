package ch.brix.gql.client.frontify.builders;

public class RemoveAssetRelations_relatedAssets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public RemoveAssetRelations_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "Asset"));
  }
  public RemoveAssetRelations_relatedAssets onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_relatedAssets onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_relatedAssets onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_relatedAssets onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_relatedAssets onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_relatedAssets onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveAssetRelations_relatedAssets onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
