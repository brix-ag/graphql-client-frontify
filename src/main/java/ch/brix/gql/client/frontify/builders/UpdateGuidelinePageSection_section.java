package ch.brix.gql.client.frontify.builders;

public class UpdateGuidelinePageSection_section extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageSection> {
  public UpdateGuidelinePageSection_section() {
    super(new ch.brix.gql.client.Call<>("section", "GuidelinePageSection"));
  }
  public UpdateGuidelinePageSection_section onGuidelinePageSection(On_GuidelinePageSection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
