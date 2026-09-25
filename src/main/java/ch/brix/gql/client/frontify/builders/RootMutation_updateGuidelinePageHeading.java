package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelinePageHeading extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelinePageHeading> {
  public RootMutation_updateGuidelinePageHeading() {
    super(new ch.brix.gql.client.Call<>("updateGuidelinePageHeading", "UpdateGuidelinePageHeading"));
  }
  public RootMutation_updateGuidelinePageHeading args(RootMutation_updateGuidelinePageHeading_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelinePageHeading onUpdateGuidelinePageHeading(On_UpdateGuidelinePageHeading typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
