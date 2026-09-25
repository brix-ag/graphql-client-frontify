package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelinePageHeading extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelinePageHeading> {
  public RootMutation_deleteGuidelinePageHeading() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelinePageHeading", "DeleteGuidelinePageHeading"));
  }
  public RootMutation_deleteGuidelinePageHeading args(RootMutation_deleteGuidelinePageHeading_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelinePageHeading onDeleteGuidelinePageHeading(On_DeleteGuidelinePageHeading typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
