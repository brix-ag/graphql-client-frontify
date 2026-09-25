package ch.brix.gql.client.frontify.builders;

public class RootMutation_configureProjectWebhook extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ConfigureProjectWebhook> {
  public RootMutation_configureProjectWebhook() {
    super(new ch.brix.gql.client.Call<>("configureProjectWebhook", "ConfigureProjectWebhook"));
  }
  public RootMutation_configureProjectWebhook args(RootMutation_configureProjectWebhook_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_configureProjectWebhook onConfigureProjectWebhook(On_ConfigureProjectWebhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
