package ch.brix.gql.client.frontify.builders;

public class RootMutation_installProjectWebhook extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.InstallProjectWebhook> {
  public RootMutation_installProjectWebhook() {
    super(new ch.brix.gql.client.Call<>("installProjectWebhook", "InstallProjectWebhook"));
  }
  public RootMutation_installProjectWebhook args(RootMutation_installProjectWebhook_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_installProjectWebhook onInstallProjectWebhook(On_InstallProjectWebhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
