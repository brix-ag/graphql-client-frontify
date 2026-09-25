package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelinePageHeading extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelinePageHeading> {
  public RootMutation_createGuidelinePageHeading() {
    super(new ch.brix.gql.client.Call<>("createGuidelinePageHeading", "CreateGuidelinePageHeading"));
  }
  public RootMutation_createGuidelinePageHeading args(RootMutation_createGuidelinePageHeading_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelinePageHeading onCreateGuidelinePageHeading(On_CreateGuidelinePageHeading typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
