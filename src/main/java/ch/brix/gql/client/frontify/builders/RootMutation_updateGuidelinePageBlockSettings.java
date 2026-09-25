package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelinePageBlockSettings extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelinePageBlockSettings> {
  public RootMutation_updateGuidelinePageBlockSettings() {
    super(new ch.brix.gql.client.Call<>("updateGuidelinePageBlockSettings", "UpdateGuidelinePageBlockSettings"));
  }
  public RootMutation_updateGuidelinePageBlockSettings args(RootMutation_updateGuidelinePageBlockSettings_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelinePageBlockSettings onUpdateGuidelinePageBlockSettings(On_UpdateGuidelinePageBlockSettings typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
