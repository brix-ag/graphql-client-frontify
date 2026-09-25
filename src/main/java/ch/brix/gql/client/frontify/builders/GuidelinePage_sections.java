package ch.brix.gql.client.frontify.builders;

public class GuidelinePage_sections extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageSectionItems> {
  public GuidelinePage_sections() {
    super(new ch.brix.gql.client.Call<>("sections", "GuidelinePageSectionItems"));
  }
  public GuidelinePage_sections args(GuidelinePage_sections_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelinePage_sections onGuidelinePageSectionItems(On_GuidelinePageSectionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
