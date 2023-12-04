package ch.brix.gql.client.frontify.builders;

public class BrandSearchResultEdge_node extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.BrandSearchResult> {
  public BrandSearchResultEdge_node() {
    super(new ch.brix.gql.client.Call<>("node", "BrandSearchResult"));
  }
  public BrandSearchResultEdge_node onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchResultEdge_node onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchResultEdge_node onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchResultEdge_node onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchResultEdge_node onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchResultEdge_node onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
