package ch.brix.gql.client.frontify.builders;

public class GuidelineContentSearchItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.GuidelineContentSearchResult>> {
  public GuidelineContentSearchItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelineContentSearchResult"));
  }
  public GuidelineContentSearchItems_items onGuidelineContentSearchResult(On_GuidelineContentSearchResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
