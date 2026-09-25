package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelinePageSection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelinePageSection> {
  public RootMutation_createGuidelinePageSection() {
    super(new ch.brix.gql.client.Call<>("createGuidelinePageSection", "CreateGuidelinePageSection"));
  }
  public RootMutation_createGuidelinePageSection args(RootMutation_createGuidelinePageSection_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelinePageSection onCreateGuidelinePageSection(On_CreateGuidelinePageSection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
