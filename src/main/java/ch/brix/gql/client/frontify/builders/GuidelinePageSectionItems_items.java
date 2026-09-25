package ch.brix.gql.client.frontify.builders;

public class GuidelinePageSectionItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.GuidelinePageSection>> {
  public GuidelinePageSectionItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelinePageSection"));
  }
  public GuidelinePageSectionItems_items onGuidelinePageSection(On_GuidelinePageSection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
