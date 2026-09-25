package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlock_type extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlockType> {
  public GuidelinePageBlock_type() {
    super(new ch.brix.gql.client.Call<>("type", "GuidelinePageBlockType"));
  }
  public GuidelinePageBlock_type onGuidelinePageBlockType(On_GuidelinePageBlockType typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
