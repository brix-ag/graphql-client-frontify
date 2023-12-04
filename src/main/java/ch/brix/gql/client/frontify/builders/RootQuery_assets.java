package ch.brix.gql.client.frontify.builders;

public class RootQuery_assets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public RootQuery_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "Asset"));
  }
  public RootQuery_assets args(RootQuery_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_assets onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_assets onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_assets onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_assets onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_assets onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_assets onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_assets onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
