package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorBlock_type extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlockType> {
  public BrandEssentialsColorBlock_type() {
    super(new ch.brix.gql.client.Call<>("type", "GuidelinePageBlockType"));
  }
  public BrandEssentialsColorBlock_type onGuidelinePageBlockType(On_GuidelinePageBlockType typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
