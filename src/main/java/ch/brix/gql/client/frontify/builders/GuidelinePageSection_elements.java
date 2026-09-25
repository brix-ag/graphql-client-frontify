package ch.brix.gql.client.frontify.builders;

public class GuidelinePageSection_elements extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageSectionElementItems> {
  public GuidelinePageSection_elements() {
    super(new ch.brix.gql.client.Call<>("elements", "GuidelinePageSectionElementItems"));
  }
  public GuidelinePageSection_elements args(GuidelinePageSection_elements_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelinePageSection_elements onGuidelinePageSectionElementItems(On_GuidelinePageSectionElementItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
