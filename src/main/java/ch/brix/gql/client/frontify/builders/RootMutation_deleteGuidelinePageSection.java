package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelinePageSection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.DeleteGuidelinePageSection> {
  public RootMutation_deleteGuidelinePageSection() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelinePageSection", "DeleteGuidelinePageSection"));
  }
  public RootMutation_deleteGuidelinePageSection args(RootMutation_deleteGuidelinePageSection_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelinePageSection onDeleteGuidelinePageSectionSuccessful(On_DeleteGuidelinePageSectionSuccessful typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootMutation_deleteGuidelinePageSection onDeleteGuidelinePageSectionReferenced(On_DeleteGuidelinePageSectionReferenced typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
