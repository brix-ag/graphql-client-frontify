package ch.brix.gql.client.frontify.builders;

public class GuidelinePageItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.GuidelinePage>> {
  public GuidelinePageItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelinePage"));
  }
  public GuidelinePageItems_items onGuidelinePage(On_GuidelinePage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
