
# Catálogo de Filmes em Java - Santander Coders

Este é um projeto Java que simula um catálogo de filmes, inspirado no IMDb. O sistema permite cadastrar filmes, atores, diretores e associar corretamente os atores e diretores aos filmes. Além disso, oferece a funcionalidade de pesquisar filmes cadastrados pelo nome, desconsiderando letras maiúsculas e minúsculas.

## Funcionalidades Principais

- Cadastro de Filmes
- Cadastro de Atores e Diretores
- Associação de Atores e Diretores aos Filmes
- Pesquisa de Filmes por Nome (ignorando maiúsculas/minúsculas)

## Estrutura do Projeto

- `Ator` e `Diretor`: Subclasses de `Pessoa` com atributos específicos.
- `Filme`: Classe representando um filme com informações como nome, descrição, data de lançamento, etc.
- `CatalogoFilmes`: Classe que mantém uma lista de filmes e oferece métodos para cadastro e pesquisa.

## Como Usar

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
