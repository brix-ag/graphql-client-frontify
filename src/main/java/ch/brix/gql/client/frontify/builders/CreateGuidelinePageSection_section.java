package ch.brix.gql.client.frontify.builders;

public class CreateGuidelinePageSection_section extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageSection> {
  public CreateGuidelinePageSection_section() {
    super(new ch.brix.gql.client.Call<>("section", "GuidelinePageSection"));
  }
  public CreateGuidelinePageSection_section onGuidelinePageSection(On_GuidelinePageSection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
