package ch.brix.gql.client.frontify.builders;

public class BrandSearchItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.BrandSearchResult>> {
  public BrandSearchItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "BrandSearchResult"));
  }
  public BrandSearchItems_items onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchItems_items onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchItems_items onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchItems_items onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchItems_items onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandSearchItems_items onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
