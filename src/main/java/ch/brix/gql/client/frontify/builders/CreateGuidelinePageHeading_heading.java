package ch.brix.gql.client.frontify.builders;

public class CreateGuidelinePageHeading_heading extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageHeading> {
  public CreateGuidelinePageHeading_heading() {
    super(new ch.brix.gql.client.Call<>("heading", "GuidelinePageHeading"));
  }
  public CreateGuidelinePageHeading_heading onGuidelinePageHeading(On_GuidelinePageHeading typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
