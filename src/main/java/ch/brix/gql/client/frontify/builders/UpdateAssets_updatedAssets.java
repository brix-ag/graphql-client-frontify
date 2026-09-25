package ch.brix.gql.client.frontify.builders;

public class UpdateAssets_updatedAssets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public UpdateAssets_updatedAssets() {
    super(new ch.brix.gql.client.Call<>("updatedAssets", "Asset"));
  }
  public UpdateAssets_updatedAssets onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAssets_updatedAssets onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAssets_updatedAssets onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAssets_updatedAssets onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAssets_updatedAssets onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAssets_updatedAssets onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateAssets_updatedAssets onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
