package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelinePageBlock extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelinePageBlock> {
  public RootMutation_createGuidelinePageBlock() {
    super(new ch.brix.gql.client.Call<>("createGuidelinePageBlock", "CreateGuidelinePageBlock"));
  }
  public RootMutation_createGuidelinePageBlock args(RootMutation_createGuidelinePageBlock_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelinePageBlock onCreateGuidelinePageBlock(On_CreateGuidelinePageBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
