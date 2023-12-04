package ch.brix.gql.client.frontify.builders;

public class RootQuery_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Asset> {
  public RootQuery_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "Asset"));
  }
  public RootQuery_asset args(RootQuery_asset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_asset onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_asset onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_asset onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_asset onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_asset onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_asset onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
