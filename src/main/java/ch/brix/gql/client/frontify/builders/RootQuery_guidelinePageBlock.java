package ch.brix.gql.client.frontify.builders;

public class RootQuery_guidelinePageBlock extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.GuidelinePageBlockInterface> {
  public RootQuery_guidelinePageBlock() {
    super(new ch.brix.gql.client.Call<>("guidelinePageBlock", "GuidelinePageBlockInterface"));
  }
  public RootQuery_guidelinePageBlock args(RootQuery_guidelinePageBlock_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_guidelinePageBlock onBrandEssentialsColorBlock(On_BrandEssentialsColorBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelinePageBlock onGuidelinePageBlock(On_GuidelinePageBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_guidelinePageBlock onGuidelinePageBlockInterface(On_GuidelinePageBlockInterface typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
