package ch.brix.gql.client.frontify.builders;

public class MoveAssets_assets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public MoveAssets_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "Asset"));
  }
  public MoveAssets_assets onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public MoveAssets_assets onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public MoveAssets_assets onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public MoveAssets_assets onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public MoveAssets_assets onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public MoveAssets_assets onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public MoveAssets_assets onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
