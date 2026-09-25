package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockInterface_type extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlockType> {
  public GuidelinePageBlockInterface_type() {
    super(new ch.brix.gql.client.Call<>("type", "GuidelinePageBlockType"));
  }
  public GuidelinePageBlockInterface_type onGuidelinePageBlockType(On_GuidelinePageBlockType typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
