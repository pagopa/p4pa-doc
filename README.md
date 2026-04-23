## Descrizione
Piattaforma Unitaria* (di seguito PU) è una soluzione ideata e sviluppata da PagoPA per supportare gli EC nella gestione del ciclo di vita delle proprie Posizioni Debitorie.

L’idea è quella di garantire agli EC un applicativo consistente con i processi e i modelli dati attualmente presenti nella piattaforma pagoPA in modo da garantire un’integrazione con tutte le funzionalità esposte, facilmente manutenibile ed evolvibile in accordo con le novità che verranno introdotte nelle SANP.

Supportare gli EC nel ciclo di vita delle proprie Posizioni Debitorie necessita inoltre di integrare all’interno di Piattaforma Unitaria anche gli altri prodotti dell’ecosistema PagoPA: SEND, AppIO e PDND. L’applicativo quindi presenta e implementa i layer deputati alla comunicazione con questi applicativi.

Il prodotto si identifica con un’architettura moderna e scalabile, frutto dell’esperienza dei team tecnici di PagoPA.

Il modello implementato si basa sul concetto di EC “Intermediario” ed EC “intermediati”; tuttavia, in assenza di intermediazione e nel caso di erogazione a un singolo EC, tale schema non è vincolante. In questi casi, il singolo EC assumerà di fatto il ruolo di EC intermediario.

PU consente di gestire, all’interno di una singola istanza, più EC Intermediari, ciascuno con il proprio insieme di EC Intermediati. Attualmente, ogni EC Intermediato è associato a un unico EC Intermediario all’interno di PU.

PU non include il modulo di autenticazione, fornisce un apposito connettore (p4pa-auth) verso lo IAM dell’erogatore o dell’EC Intermediario.

## Valore aggiunto

**Architettura moderna e scalabile**: progettata per evolvere nel tempo  
**Integrazione nativa con l’ecosistema pagoPA**: inclusi SEND, IO, pagoPA, PDND 
**Allineamento continuo alle evoluzioni normative**: SANP, GDPR  
**Esperienza utente rinnovata**: conforme alle Linee guida di design AgID  
**Interoperabilità e automazione dei processi**: a supporto della trasformazione digitale della PA  

## Benefici per la Pubblica Amministrazione

**Miglioramento della qualità del servizio**  
Processi standardizzati, automatizzati e tracciabili che garantiscono maggiore affidabilità, trasparenza e tempestività.

**Semplificazione dei processi di affidamento**  
Soluzione riusabile e conforme agli standard nazionali che riduce tempi e complessità progettuali.

**Riduzione dei costi di integrazione**  
Integrazione nativa con l’ecosistema pagoPA che limita sviluppi personalizzati.

**Esperienza utente sicura e conforme**  
Security by design, privacy by design, autenticazione OAuth2/OIDC, conformità GDPR e rispetto delle Linee guida AgID.

## Funzionalità principali

**Gestione completa del ciclo di vita dei pagamenti**  
Copre tutte le fasi del ciclo di vita delle posizioni debitorie, dalla generazione, notifica e pagamento fino alla riconciliazione, classificazione, accertamenti e rendicontazione.

**Notifiche a valore legale**  
Integrazione con i canali di notifica previsti dall’ecosistema pagoPA, garantendo validità giuridica e tracciabilità.

**Dashboard e reportistica avanzata**  
Monitoraggio in tempo reale dello stato dei pagamenti, analisi approfondite dei flussi finanziari e report per le attività di controllo e audit.

**Integrazione con l’ecosistema pagoPA**  
Supporta SEND, IO, pagoPA e PDND, facilitando l’interoperabilità e riducendo le integrazioni personalizzate.

**Automazione dei processi e monitoraggio**  
Processi standardizzati, automatizzati e tracciabili, che riducono errori operativi e accelerano le attività di gestione.

**Sicurezza e conformità normativa**  
Architettura progettata secondo i principi di security by design e privacy by design, con autenticazione basata su OAuth2/OIDC, piena conformità al GDPR e rispetto delle Linee guida AgID per i servizi digitali della PA.

**Esperienza utente ottimizzata**  
Interfaccia centralizzata e intuitiva, progettata per migliorare l’usabilità e semplificare l’accesso ai servizi di pagamento per gli enti intermediari e intermediati.

## Repository collegati
**Front-End**  
[p4pa-pu-fe](https://github.com/pagopa/p4pa-pu-fe)  

**Back-End**  
[p4pa-analytics-data-ingestion](https://github.com/pagopa/p4pa-analytics-data-ingestion)  
[p4pa-analytics-data-processing](https://github.com/pagopa/p4pa-analytics-data-processing)  
[p4pa-auth](https://github.com/pagopa/p4pa-auth) 
[p4pa-classification](https://github.com/pagopa/p4pa-classification)  
[p4pa-debt-positions](https://github.com/pagopa/p4pa-debt-positions)  
[p4pa-fileshare](https://github.com/pagopa/p4pa-fileshare)  
[p4pa-iam-sync](https://github.com/pagopa/p4pa-iam-sync)  
[p4pa-io-notification](https://github.com/pagopa/p4pa-io-notification)  
[p4pa-workflow-hub](https://github.com/pagopa/p4pa-workflow-hub)  
[p4pa-workflow-worker](https://github.com/pagopa/p4pa-workflow-worker)  
[p4pa-migration](https://github.com/pagopa/p4pa-migration)  
[p4pa-organization](https://github.com/pagopa/p4pa-organization)  
[p4pa-pagopa-payments](https://github.com/pagopa/p4pa-pagopa-payments)  
[p4pa-payhub-activities](https://github.com/pagopa/p4pa-payhub-activities)  
[p4pa-pdnd-services](https://github.com/pagopa/p4pa-pdnd-services)  
[p4pa-process-executions](https://github.com/pagopa/p4pa-process-executions)  
[p4pa-pu-bff](https://github.com/pagopa/p4pa-pu-bff)  
[p4pa-pu-sil](https://github.com/pagopa/p4pa-pu-sil)  
[p4pa-registries](https://github.com/pagopa/p4pa-registries)  
[p4pa-send-notification](https://github.com/pagopa/p4pa-send-notification)  
[p4pa-superset](https://github.com/pagopa/p4pa-superset)  

## Manualistica Utente
La documentazione utente per l'uso del software è disponibile ai seguenti indirizzi:  
[Manuale Amministratore Ente Intermediario](reference/user-docs/Manuale_Amministratore_Ente_Intermediario.pdf)  
[Manuale Amministratore Ente Intermediato](reference/user-docs/Manuale_Amministratore_Ente_Intermediato.pdf)  
[Manuale Operatore Ente](reference/user-docs/Manuale_Operatore_Ente.pdf) 

