package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelinePageSection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelinePageSection> {
  public RootMutation_updateGuidelinePageSection() {
    super(new ch.brix.gql.client.Call<>("updateGuidelinePageSection", "UpdateGuidelinePageSection"));
  }
  public RootMutation_updateGuidelinePageSection args(RootMutation_updateGuidelinePageSection_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelinePageSection onUpdateGuidelinePageSection(On_UpdateGuidelinePageSection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
