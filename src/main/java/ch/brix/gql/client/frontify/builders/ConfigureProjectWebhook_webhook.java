package ch.brix.gql.client.frontify.builders;

public class ConfigureProjectWebhook_webhook extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ProjectWebhook> {
  public ConfigureProjectWebhook_webhook() {
    super(new ch.brix.gql.client.Call<>("webhook", "ProjectWebhook"));
  }
  public ConfigureProjectWebhook_webhook onProjectWebhook(On_ProjectWebhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
